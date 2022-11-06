# 자료구조

## HashTable

- 키, 벨류 한 쌍으로 데이터를 저장하는 자료구조
- 해시함수로 해시값을 계산
- 자료 접근 시간 복잡도가 O(1)로 빠름.
    - 자료 접근 시에도 저장할때와 마찬가지로 키를 해시함수에 넣고 얻은 해시값에 배정된 값을 바로 접근하면 되기 때문

### Hash 함수

예시 코드

```java
public int hash(Object key) {
		return key.hashCode() % this.size;
}
```

- 키 값을 해시함수에 넣음
- size로 나누눈 나머지를 리턴하는 이유는 hash 함수를 통해 얻은 값을 인덱스로 활용하기 때문.

## 해시 충돌

> **해시 함수 예시**
> 

```java
public int hash(String key) {
    int asciiSum = 0;
    for (int i = 0; i < key.length(); i++) {
        asciiSum += key.charAt(i);
    }
    return asciiSum % size;
}
```

위 해시함수를 사용하면 `minwoo`와 `oownim` 의 해시값이 같아진다.

`minwoo`가 들어있는 공간에 `oownim`이 또 들어가려고하는 충돌이 발생한다.

이와 같이 해시 값이 겹쳐 발생하는 문제를 해시 충돌이라고 한다.

<img alt="스크린샷_2022-10-26_오후_3 07 11" src="https://user-images.githubusercontent.com/77231274/200105721-dad33775-6cae-4066-8896-c2b4fcb4cbd7.png">

### 해결방법

### 1. 공간안에 또 다른 공간

내가 들어갈 자리에 누군가 있다면 리스트, 배열로 그 공간을 함께 사용한다.

<img alt="스크린샷_2022-10-26_오후_3 10 46" src="https://user-images.githubusercontent.com/77231274/200105731-e76ae1bf-1a69-4327-a236-2cd8a24556bb.png">

```java
public void insert(String key, Integer value) {
      int hashCode = hash(key);
      if (this.table[hashCode] == null) { // 들어갈 공간에 List가 초기화 되어있지 않다면
          this.table[hashCode] = new ArrayList<>(); // List 초기화
      }
      this.table[hashCode].add(new Node(key, value)); // Node 객체를 생성해 List에 추가
}
```

### 2. 자리가 없으면 다른 빈 공간을 찾는다.

중복이 발생하면 다른 빈 칸을 찾아 넣는다.

![Untitled (1)](https://user-images.githubusercontent.com/77231274/200105734-489d659d-655a-4c79-895c-768cdc79c057.png)

### Node? List<Node>[] ???

> **Node**
> 

```java
public class HashTable {
		private int size = 10000;
    private List<Node>[] table = new List[size];

		class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }
		// ...
}
```

key와 value 한 쌍을 저장하기 좋게 Node 객체를 만들었어요.

> **List<Node>[]**
> 

key와 value 한 쌍을 담은 Node객체를 담은 리스트의 배열…. 그림으로 보면

![Untitled (2)](https://user-images.githubusercontent.com/77231274/200105738-c7d8246f-59d1-4fd7-97fd-85ea43c7c7f2.png)

```java
List<Node>[] table = new List[100];
```

코드를 처음부터 차근차근 보면, List를 선언한다 그 리스트안에는 Node 객체가 들어간다. 그리고 그 Node가 담겨있는 List의 배열(`[]`)을 만든다는 뜻이다.

```java
String[] strArr = new String[5];
```

위 코드는 흔히보던 문자열이 담긴 배열을 말한다. `[]` 앞의 타입으로 배열을 만든다는 뜻이다.

그럼 `[String, String, String, String, String]` 배열이 만들어질 것이다.

다시 `table` 선언 코드를 보자.

`[]` 배열이다. 배열인데 `List` 가 담긴다. 그리고 그 `List` 에는 `Node` 가 들어간다.

`[List<Node>, List<Node>, List<Node>, List<Node>, ... ]`

# Hash
Hash Table에 존재하는 해시함수의 결과물

저장소에서 value와 매칭되어 저장된다.

<br><br><br>


## Hash Table(해시 테이블)
무한에 가까운 데이터들을 유한한 개수의 해시 값으로 매핑한 테이블이다.

![image](https://user-images.githubusercontent.com/74857364/199940481-a6042185-c958-4659-a010-7012bc478471.png)

`키(key)`, `해시함수(hash function)`, `해시(hash)`, `저장소(buckets)`, `값(value)`로 이루어져 있다.

키(key)는 해시함수(hash function)를 통해 해시(hash)로 변경이 되며 해시는 값(value)과 매칭되어 저장소에 저장이 된다.

- `키(key)` : 고유한 값이며, 해시 함수의 input이 된다.
- `해시함수(Hash Function)` : 키(key)를 해시(hash)로 바꿔주는 역할을 한다.
- `해시(Hash)` : 해시 함수(Hash Function)의 결과물이며, 저장소(bucket, slot)에서 값(value)과 매칭되어 저장된다.
- `값(Value)` : 저장소(bucket, slot)에 최종적으로 저장되는 값으로 키와 매칭되어 저장, 삭제, 검색, 접근이 가능해야 한다.


<br><br>         

해시 테이블은 (Key, Value)로 데이터를 저장하는 자료구조 중 하나로 빠르게 데이터를 검색할 수 있는 자료구조이다. 

빠른 검색속도를 제공하는 이유는 내부적으로 `배열(버킷)`을 사용하여 데이터를 저장하기 때문이다. 

해시 테이블은 각각의 **Key**값에 **해시함수**를 적용해 배열의 고유한 **index**를 생성하고, 이 **index**를 활용해 값을 저장하거나 검색하게 된다. 

여기서 실제 값이 저장되는 장소를 `버킷` 또는 `슬롯`이라고 한다.

<br>

삽입, 삭제, 탐색 시 평균적으로 'O(1)`의 시간 복잡도를 가진다. (index)         

<br><br><br>

## Hash Collision(해시 충돌)
해시테이블은 삽입, 삭제, 검색 과정에서 모두 평균적으로 `O(1)`의 시간복잡도를 가지고 있기 때문에            
자료구조의 효율성 측면에서 매우 우수하다고 볼 수 있다. 

하지만 데이터가 많아지면, 다른 데이터가 같은 해시 값으로 충돌나는 현상이 발생한다. → 'collision' 현상

![image](https://user-images.githubusercontent.com/74857364/199941829-f63b63b0-76fd-4468-90d8-b4f8dd97edf2.png)

Hash Collision은 필연적으로 나타날 수 밖에 없다. 

n+1개의 비둘기가 n개의 비둘기 집에 들어간다면 적어도 1개 이상의 비둘기 집에 2마리 이상의 비둘기가 있을 것이다. (비둘기의 집의 원리)

<br><br><br>

### 충돌 문제 해결                   
#### Separate Chaining(간추려서 Chaining) 
- 연결리스트로 노드를 계속 추가해나가는 방식 (제한 없이 계속 연결 가능, but 메모리 문제)

![image](https://user-images.githubusercontent.com/74857364/199942417-c336da7b-0007-4f88-bad4-0864541dc780.png)

체이닝(Chaining)은 자료 저장 시, 저장소(bucket)에서 충돌이 일어나면 해당 값을 기존 값과 연결시키는 기법이다.

이 때 연결리스트(Linked List) 자료구조를 이용한다. 

<br><br><br>

#### Open Addressing(개방주소법) 
- 해시 함수로 얻은 주소가 아닌 다른 주소에 데이터를 저장할 수 있도록 허용 (해당 키 값에 저장되어있으면 다음 주소에 저장)

<br>

개방주소법은 데이터의 해시(hash)가 변경되지 않았던 chaining과는 달리 비어있는 해시(hash)를 찾아 데이터를 저장하는 기법이다. 

따라서 개방주소법에서의 해시테이블은 1개의 해시와 1개의 값(value)가 매칭되어 있는 형태로 유지된다.

<br><br><br>

## HashTable vs HashMap
자바에서 HashTable을 더 이상 지원하지 않는다며 HashMap을 사용하는 글을 봤다.

<br><br>

기본적인 동작은 HashTable이나 HashMap은 같다.

Key object - Value object 를 쌍으로 저장하여 seek타임을 줄이기 위해 hash값을 이용한다.

<br><br>

### HashTable
key, value에 Null을 허용하지 않는다.

<br><br>

### HashMap
key, value에 Null을 허용한다.

<br><br>

Hashtable은 thread safe 한 객체이지만 HashMap은 그렇지 못해 unsynchronized 한다.

→ 멀티 쓰레드 환경이 아니면 HashMap을 쓰면 속도가 빠르다는 말

<br><br><br>

출처                
[Hash, Hashing, Hash Table(해시, 해싱 해시테이블) 자료구조의 이해](https://velog.io/@cyranocoding/Hash-Hashing-Hash-Table%ED%95%B4%EC%8B%9C-%ED%95%B4%EC%8B%B1-%ED%95%B4%EC%8B%9C%ED%85%8C%EC%9D%B4%EB%B8%94-%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0%EC%9D%98-%EC%9D%B4%ED%95%B4-6ijyonph6o)                 
[[자료구조] Hash 란? Hash Table 이란?](https://mintpsyco.tistory.com/8)                         
[[자료구조] 해시테이블(HashTable)이란?](https://mangkyu.tistory.com/102)                    
[[자료구조] 해시(Hash)란 무엇인가](https://ablue-1.tistory.com/68)                     
[[자료구조] Hash란? Java로 구현코드](https://bangu4.tistory.com/179)             
[HashTable vs HashMap](http://egloos.zum.com/pelican7/v/2583699)       
[[자료구조]Hash Table(해시테이블) - 구현/Java(자바)](https://m.blog.naver.com/jysaa5/221852453437) : 코드만 참고     

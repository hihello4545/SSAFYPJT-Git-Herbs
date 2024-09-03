# 🍀 GIT HERBS - 안전한 약초 채집을 위한 나만의 약초 저장소
SSAFY 10기 2학기 특화 프로젝트 - 행복만땅 (팀 A205) 


<p align="center">
  <img src="산출물/docs/asset/logo.png" width="400">
</p>

<br><br>

[//]: # (<img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=React&logoColor=white"> <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=white"> <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=MySQL&logoColor=white"> <img src="https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=Jenkins&logoColor=white"> <img src="https://img.shields.io/badge/NGINX-009639?style=for-the-badge&logo=NGINX&logoColor=white"> <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=Docker&logoColor=white"> )

![Github](https://img.shields.io/badge/react-2.6.11-61DAFB?style=plastic&logo=React) ![Github](https://img.shields.io/badge/spring_boot-3.2.3-%236DB33F?style=plastic&logo=Spring) ![Github](https://img.shields.io/badge/MySQL-8.0-%234479A1?style=plastic&logo=mysql) ![Github](https://img.shields.io/badge/Redis-7.2.4-%23DC382D?style=plastic&logo=Redis) ![Github](https://img.shields.io/badge/Fastapi-0.11.0-009688?style=plastic&logo=Fastapi) ![Github](https://img.shields.io/badge/Tensorflow-2.15.0-FF6F00?style=plastic&logo=Tensorflow) ![Github](https://img.shields.io/badge/Docker-25.0.4-2496ED?style=plastic&logo=docker)


## 🌱 [GIT HERBS URL](https://j10a205.p.ssafy.io/)

## 🌱 [UCC URL]() : 추가 예정

## 📅 프로젝트 기간
2024.02.18 (월)  ~ 2024.04.04 (목)

## 💡 서비스 개요
### 배경
매년 꾸준히 발생하고 있는 약초 채집 중 중독 사고를 예방하고, 약초에 대해 잘 모르는 일반인이 산행 중 궁금증을 해소시켜주고자 함

### 목표
약초에 대해 잘 알지 못하는 초보 약초꾼이 약초를 구분하고, 안전하게 채집할 수 있도록 도와주는 서비스 제작


## 📚 산출물

1️⃣ [기획](산출물/docs/기획서.pdf)    
2️⃣ [와이어프레임](산출물/docs/와이어프레임.md)   
3️⃣ [목업](산출물/docs/목업.md)    
4️⃣ [요구사항 명세서](산출물/docs/요구사항명세서.pdf)     
5️⃣ [API 명세서](산출물/docs/API명세서.pdf)     
6️⃣ [아키텍쳐](산출물/docs/아키텍처.md)  
7️⃣ [ERD](산출물/docs/ERD.md)  
8️⃣ [JIRA](산출물/docs/JIRA.md)


## 📚 프로젝트 결과물
- 포팅메뉴얼
- 중간발표자료
- 최종발표자료


## 🍁 주요 기능

| 구분 | 기능 | 설명                                                                                                                                     | 비고                                               | 
|---:|:--:|:---------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------|
|  1 | 검색 | - 약초 이름으로 원하는 약초를 찾을 수 있습니다.<br/> - 약초 효능으로 원하는 약초를 찾을 수 있습니다.<br/>- 최근 즐겨찾기한 약초와 비슷한 약초를 추천합니다. <br/> - 최근 검색어를 제공해 검색의 편리함을 증가시켰습니다. | - elasticsearch 로 검색 효율 증가 <br/> - 콘텐츠 기반 필터링 적용 |
|  2 | 촬영 | - 약초 사진을 업로드 하면 약초를 판별하여 알려줍니다. <br/> - 분석 완료된 사진은 나의 도감에 추가할 수 있습니다.                                                                  | - AI 약초 이미지 학습                                   |
|  3 | 도감 | - 관심있는 약초와 도감 등록된 약초들에 대한 조회가 가능합니다. <br/> - 약초에 대한 상세 정보를 제공합니다. <br/> - 약초가 분포되어 있는 지역을 시각화하여 보여줍니다.<br/>                            | - 약초 데이터 수집 후 가공                                 |
|  4 | 퀴즈 | - 하루 한번씩 약초 관련 퀴즈를 제공하여 약초에 관한 관심을 유도합니다.                                                                                              |                                                  |
|  5 | 잔디 | - 사용자의 일일 활동량을 기록합니다.                                                                                                                  |                                                  |
|  6 | 랭킹 | - 한달 활동량을 기반으로 사용자에게 순위를 부여합니다.  <br/> - 사용자의 서비스 이용을 유도합니다.                                                                           |                                                  |
|  7 | 정보 | - 약초 채집에 도움이 될 정보들을 제공합니다. (날씨, 야생동물, 제철약초, 월별 팁, 위급사항 행동 요령)                                                                          | - 실시간 날씨 API 사용 <br/>                            |


## 🔍 서비스 화면 
- **랭킹 시스템**    
  한달동안 활동기록을 합산하여 상위 3명의 유저 정보를 제공  
  ![랭킹](/산출물/docs/asset/랭킹.gif)        

- **로그인**
  사진 촬영, 나만의 도감과 관련된 기능은 로그인한 사용자에게만 제공      
  ![로그인](/산출물/docs/asset/로그인.gif)

- **오늘의 약초**   
  매일 다른 약초를 유저에게 약초 학습 기회 제공    
  ![오늘의약초](/산출물/docs/asset/오늘의약초.gif)       


- **오늘의 퀴즈**     
  매일 다른 퀴즈를 유저에게 노출시켜 약초 학습 기회 제공. 하루에 한번만 풀이 가능하다.    
  ![오늘의퀴즈정답](/산출물/docs/asset/오늘의퀴즈.gif) ![오늘의퀴즈중복](/산출물/docs/asset/오늘의퀴즈2.gif)    


- **약초 분석**   
  사용자가 사진을 찍거나 사진첩에 있는 사진을 등록하여 사진을 분석    
  ![약초분석](/산출물/docs/asset/도감약초분석2.gif)  ![약초분석등록](/산출물/docs/asset/도감약초등록.gif)


- **게시판 분석**   
  사용자가 나만의 도감에 등록했던 사진들을 다른 사용자들과 공유할 수 있다. 마음에 드는 사진은 좋아요를 통해 유저간의 소통이 가능하다.   
  ![게시판등록](/산출물/docs/asset/게시판등록.gif)  ![게시판즐겨찾기](/산출물/docs/asset/게시판즐겨찾기.gif)


- **도감정렬**   
  도감 데이터는 사용자에게 정렬기능(가나다순, 즐겨찾기순, 사진촬영등록순)을 제공  
  ![도감정렬](/산출물/docs/asset/도감정렬.gif)  


- **약초검색**    
  사용자가 원하는 약초를 더 편하게 찾을 수 있는 기능 제공. 약초 이름 또는 약효(엘라스틱서치)에 일치하는 내용이 있는 약초 제공    
  ![약초검색2](/산출물/docs/asset/약초검색2.gif) ![약초검색1](/산출물/docs/asset/약초검색1.gif)


- **약초추천**   
  사용자가 최근에 관심 있어하는 약초 기반으로 약효가 비슷한 3가지의 약초를 추천    
  ![약초검색추천](/산출물/docs/asset/약효검색.gif)    


- **위기 탈출**      
  약초 채집 시 필요한 정보들 제공 (실시간 날씨 API, 야생 동물 서식 구역, 제철 약초, 월별 Tip)      
  ![위기탈출](/산출물/docs/asset/위기탈출.gif) 


- **마이 페이지**        
  마이페이지에서 닉네임과 프로필을 수정, 활동 내역을 월별로 제공, 서비스 이용 내역에 따른 뱃지 제공            
  ![마이페이지1](/산출물/docs/asset/마이페이지1.gif)   ![마이페이지2](/산출물/docs/asset/마이페이지2.gif)


## 🧰 주요 기술 스택

- 🛠️ **Backend**
  - Intellij
  - JAVA 17
  - Springboot 3.2.3
  - Spring Data JPA 3.2.3
  - Spring Validation 
  - Spring Web 
  - QueryDSL 5.0.0
  - JWT 0.12.5
  - Redis 7.2.4
  - MySQL 8.0
  - Elasticsearch 8.12.2


- 🛠️ **Frontend**
  - Vscode 
  - HTML5
  - CSS
  - JS
  - React 18.2.0
  - Axios 1.6.8
  - React-Router-Dom 6.22.3
  - Node 20.11.1
  - React-Dom 18.2.0
  - Zustand 4.5.2
  - Styled-Components 6.1.8


- 🛠️ **Data**
  - Python(3.11)
  - FastAPI(0.110.0)
  - uvicorn(0.29.0) 
  - tensorflow(2.15.0) 
  - konply(0.6.0) 
  - pandas(2.2.1) 
  - numpy(1.26.4) 
  - scikit-learn(1.12.0) 
  - jupyter hub(4.0.2) 


- 🛠️ **Infra**
  - AWS EC2
  - Amazon S3 1.12.529
  - Docker 25.0.4  
  - NGINX 1.18.0
  - Ubuntu 20.04.6
  - Logstash 8.12.2
  - Kibana 8.12.2
  - JENKINS
  - sonarlint
  - SSL 


- 🛠️ **협업**
  - Jira
  - GitLab
  - Notion
  - Mattermost
  - Discord
  - Figma
  - Webex

  
## 📌 프로젝트 구조
### **Frontend**

```
📦frontend
 ┣ 📂public
 ┃ ┣ 📂grass
 ┃ ┣ 📂herbs
 ┃ ┣ 📂pediaimg
 ┃ ┣ 📂profileimg
 ┣ 📂src
 ┃ ┣ 📂apis
 ┃ ┣ 📂assets
 ┃ ┃ ┣ 📂fonts
 ┃ ┣ 📂components
 ┃ ┃ ┣ 📂board
 ┃ ┃ ┣ 📂escape
 ┃ ┃ ┣ 📂herbdetail
 ┃ ┃ ┣ 📂main
 ┃ ┃ ┣ 📂mypage
 ┃ ┃ ┣ 📂pedia
 ┃ ┃ ┣ 📂picture
 ┃ ┃ ┣ 📂search
 ┃ ┣ 📂pages
 ┃ ┣ 📂store
 ┃ ┣ 📂utils
```

### **Backend**

```
📦githerbs
 ┣ 📂domain
 ┃ ┣ 📂auth
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┣ 📂board
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┣ 📂event
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┣ 📂herb
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┣ 📂manual
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┣ 📂member
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┣ 📂common
 ┃ ┃ ┃ ┣ 📂request
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┃ ┗ 📂search
 ┃ ┃ ┣ 📂controller
 ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┗ 📂response
 ┃ ┃ ┣ 📂entity
 ┃ ┃ ┣ 📂repository
 ┃ ┃ ┗ 📂service
 ┣ 📂global
 ┃ ┣ 📂common
 ┃ ┃ ┣ 📂code
 ┃ ┃ ┣ 📂exception
 ┃ ┃ ┗ 📂response
 ┃ ┣ 📂config
 ┃ ┗ 📂handler
 ┗ 📜GitherbsApplication.java
```



## 🍁 구현 기술

| 구현기술                                                                                                                                                                                                                                                                                   | 기술 특이점                                                                                                                                                                                                                                                                                                                                                                                                                          |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 1. 이용자의 사진을 분석하여 유사도가 높은 약초 정보 목록을 제공<br/> 2. elasticsearch를 활용한 약초 정보 검색<br/> 3. 캐러셀을 통해 순위에 있는 유저들 목록 제공(한달 활동량 기반)<br/>4. 매일 오늘의 약초, 약초 퀴즈 제공<br/>5. 마지막 북마크 기록에서 콘텐츠(약초 효능)를 기반으로 약초를 추천<br/>6. 검색 결과에 검색 키워드를 기반으로 관련 약초 검색 결과와 페이지 제공<br/>7. 사용자 일일 활동량 기록을 통해 마이페이지에 잔디 이미지 부여 <br/>8. 약초 채집에 도움이 될 정보들(실시간 날씨api이용, 야생동물 서식지, 제철약초, 월별 팁 등)을 랜덤으로 제공  | 1. MobileNetV3 기반 전이 학습을 수행한 모델을 통해 약초를 판별하고 유사도 정보를 제공<br/>  2. elasticsearch를 토대로 검색 효율을 약 2배 증가시킴<br/> 3. 콘텐츠 기반 필터링을 적용해 약초 조회 기능 제공<br/> 4. 젠킨스를 통해 백엔드는 무중단 배포로 사용자가 불편함을 느끼지 않도록 하였고 소나큐브 분석 과정을 추가하여 백엔드의 코드 품질을 지속적으로 관리 하였음 <br/> 5. 레디스를 이용해 RDB에 저장할 필요 없는 일시적인 정보 저장, 관리 <br/> 6. 도커를 이용해 배포환경 유지, 관리 <br/> 7. JWT를 이용해 로그인 수행 및 유지 <br/> 8. Logstash와 Kibana를 통해서 무중단 배포로 인해 사라지는 컨테이너의 로그를 수집하고 분석 할 수 있음 <br/> 9.  ngrok을 이용해 노트북에서 실행 중인 이미지 판별 서버를 외부에 공개하는 터널링을 생성해 방화벽 등 추가 설정 없이도 언제 어디서나 노트북 서버의 이미지 판별 기능 이용 가능 | 






## 🏷️  팀원 소개
<table>
  <tbody>
    <tr>
      <td align="center">
        <a href="https://github.com/onid057">
            <img src="https://avatars.githubusercontent.com/u/141606477?v=4" width="100px;" alt="팀장 김세리"/>
            <br />
            <sub><b>팀장 김세리</b></sub>
        </a>
        <div>FE</div>
      </td>
      <br />
      <td align="center">
        <a href="https://github.com/jw-choi-kzz">
            <img src="https://avatars.githubusercontent.com/u/141205653?v=4" width="100px;" alt="팀원 최지원"/>
            <br />
            <sub><b>팀원 최지원</b></sub>
        </a>
        <br />
        <div>FE</div>
      </td>
      <br/>
      <td align="center">
        <a href="https://github.com/JongJae2">
            <img src="https://avatars.githubusercontent.com/u/149658209?v=4" width="100px;" alt="팀원 이종재"/>
            <br />
            <sub><b>팀원 </b></sub>
        </a>
        <br />
        <div>BE, FE</div>
      </td>
    </tr>
    <tr>
      <td align="center">
        <a href="https://github.com/dig04214">
            <img src="https://avatars.githubusercontent.com/u/81416039?v=4" width="100px;" alt="팀원 이병창"/>
            <br />
            <sub><b>팀원 이병창</b></sub>
        </a>
        <br />
        <div>BE, AI</div>
      </td>
      <td align="center">
        <a href="https://github.com/snowman2810">
            <img src="https://avatars.githubusercontent.com/u/140784660?v=4" width="100px;" alt="팀원 강태연"/>
            <br />
            <sub><b>팀원 강태연</b></sub>
        </a>
        <br />
        <div>BE, FE ,INFRA</div>
      </td>
      <td align="center">
        <a href="https://github.com/namhyemi">
            <img src="https://avatars.githubusercontent.com/u/85321894?v=4" width="100px;" alt="팀원 남혜미"/>
            <br />
            <sub><b>팀원 남혜미</b></sub>
        </a>
        <br />
        <div>BE, AI</div>
      </td>
    </tr>
  </tbody>
</table>

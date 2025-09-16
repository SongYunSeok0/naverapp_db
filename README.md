# 🛒 Dusty Shop (Second-Hand Market)

## 📌 프로젝트 소개
Dusty Shop은 **중고거래 마켓 플랫폼**으로, 판매자가 상품을 등록하고 구매자가 주문 및 결제를 진행할 수 있는 **e-commerce 서비스**입니다.  
관리자는 상품과 주문 내역을 관리할 수 있으며, 사용자는 장바구니/위시리스트 기능을 통해 편리하게 거래할 수 있습니다.

---

## 🏗️ 시스템 아키텍처
(다이어그램 이미지 넣기)

- **Backend**: Django (Python)
- **Frontend**: HTML, CSS, Bootstrap
- **Database**: SQLite (개발용) / PostgreSQL (운영용)
- **Deployment**: (추가 예정)

---

## ✨ 주요 기능
- 회원가입 & 로그인 (계정 관리)
- 상품 등록 / 수정 / 삭제
- 장바구니 & 위시리스트
- 주문 내역 확인 & 배송 상태 변경
- 결제 모듈 연동 (Toss Payments)
- 관리자 페이지에서 통계 및 주문 관리

---

## 🗂️ 폴더 구조
```plaintext
Shop/
├─ shop/           # Django 프로젝트 설정
├─ accounts/       # 회원 관리 (로그인/회원가입)
├─ products/       # 상품 관련 앱
├─ orders/         # 주문 & 배송 관리
├─ cart/           # 장바구니 & 위시리스트
├─ static/         # CSS, JS, 이미지 파일
├─ templates/      # HTML 템플릿
└─ README.md

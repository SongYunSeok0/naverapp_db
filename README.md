# 📰 Naver News App

## 📌 프로젝트 소개
**Naver News App**은 네이버 뉴스 검색 API를 활용하여 최신 뉴스를 검색하고 조회할 수 있는 Android 애플리케이션입니다.  
사용자는 키워드로 뉴스를 검색할 수 있으며, 앱은 **Room Database**를 통해 검색 결과를 캐시하여 오프라인에서도 데이터를 확인할 수 있습니다.

---

## 🏗️ 아키텍처
- **언어/플랫폼**: Kotlin, Android
- **아키텍처 패턴**: MVVM (Model-View-ViewModel)
- **네트워킹**: Retrofit2 + Gson
- **로컬 DB**: Room Database
- **UI**: Jetpack Compose + Material3
- **DI**: Service Locator 패턴

---

## ✨ 주요 기능
- 🔍 **뉴스 검색**: 키워드 기반 네이버 뉴스 검색
- 💾 **로컬 저장소**: Room DB를 활용한 검색 결과 저장
- 📑 **뉴스 상세 보기**: 리스트에서 뉴스 클릭 시 원문 링크 이동
- 🎨 **UI**: Jetpack Compose 기반의 현대적 UI

---

## 🗂️ 폴더 구조
```plaintext
naverapp/
├─ app/src/main/java/com/example/newsapp/
│  ├─ data/                  # Room DB (NewsDao, NewsDatabase)
│  ├─ ui/                    # UI (Compose, Theme)
│  ├─ MainActivity.kt        # 앱 진입점
│  ├─ NewsApp.kt             # Compose Navigation
│  ├─ NewsRepository.kt      # 데이터 저장소 (네트워크 + 캐시)
│  ├─ NewsRetrofit.kt        # Retrofit API 정의
│  ├─ NewsViewModel.kt       # ViewModel (비즈니스 로직)
│  ├─ ServiceLocator.kt      # 의존성 주입 관리
│  └─ model.kt               # 데이터 모델 정의
│
├─ app/src/main/res/
│  ├─ layout/                # activity_main.xml
│  ├─ values/                # colors.xml, strings.xml, themes.xml
│  └─ drawable/              # 아이콘, 이미지 리소스
│
└─ AndroidManifest.xml

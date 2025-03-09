# FootballLeague-Project


## 📌 Opis Projektu
FootballLeague to aplikacja do śledzenia wyników i statystyk piłkarskich, ukazująca tabele ligowe, informacje o drużynach, piłkarzach, sędziach oraz wyników meczów. System składa się z backendu napisanego w Java Spring Boot oraz frontendu stworzonego w React. Dane są przechowywane w bazie PostgreSQL, a całość działa w kontenerach Docker.

## 📂 Struktura projektu
- **Backend** - Java Spring Boot + PostgreSQL
- **Frontend** - React
- **Baza danych** - PostgreSQL
- **Docker** - uruchomienie całego środowiska

## 🔧 Technologie
### Backend:
- **Spring Boot** 
- **PostgreSQL** 
- **Hibernate** 
- **Docker** 

### Frontend:
- **React** (UI)
- **Axios** (komunikacja z API)

## 🗄️ Struktura Bazy Danych
Projekt zawiera następujące tabele:
- `user`
- `team`
- `standing`
- `referee`
- `player`
- `pitch`
- `match`
- `league`
- `goal`
- `card`

Przykładowe dane do tabel znajdują się w pliku `insert_data.sql`.

## ⚙️ Konfiguracja Backend (Spring Boot)
Backend łączy się z bazą danych PostgreSQL za pomocą Spring Data JPA i Hibernate.

### 🔗 Połączenie Backend - Frontend (CORS)
Połączenie między frontendem a backendem jest możliwe dzięki konfiguracji CORS w Spring Boot, używając narzędzi Spring Web MVC.

## 🚀 Uruchomienie Projektu

### 🛠️ Uruchomienie Backend
1. Przejdź do katalogu backend:
   ```sh
   cd backend
   ```
2. Uruchom aplikację:
   ```sh
   ./mvnw spring-boot:run
   ```

### 🖥️ Uruchomienie Frontend
1. Przejdź do katalogu frontend:
   ```sh
   cd frontend
   ```
2. Zainstaluj zależności:
   ```sh
   npm install
   ```
3. Uruchom aplikację:
   ```sh
   npm start
   ```

### 🐳 Uruchomienie całości w Dockerze
1. Uruchom Docker i w katalogu głównym projektu wpisz:
   ```sh
   docker-compose up --build
   ```




# LoginSignup (AURA)

Ứng dụng Android mẫu thực hiện chức năng Đăng nhập và Đăng ký, được xây dựng bằng **Jetpack Compose** và tích hợp **Firebase**.

## 🚀 Tính năng

- **Đăng nhập**: Sử dụng Email và Mật khẩu thông qua Firebase Authentication.
- **Đăng ký**: Tạo tài khoản mới nhanh chóng.
- **Giao diện hiện đại**: Sử dụng Jetpack Compose và Material 3 cho trải nghiệm người dùng mượt mà.
- **Điều hướng**: Sử dụng Navigation Compose để quản lý chuyển cảnh giữa các màn hình (SignIn, SignUp, HomeScreen).
- **Hỗ trợ Đăng nhập Xã hội**: Giao diện đã sẵn sàng cho Google và Facebook Login.

## 🛠 Công nghệ sử dụng

- **Ngôn ngữ**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **UI Components**: Material Design 3
- **Backend**: [Firebase Authentication](https://firebase.google.com/docs/auth) & [Cloud Firestore](https://firebase.google.com/docs/firestore)
- **Kiến trúc**: MVVM (sơ khai)
- **Thư viện khác**:
    - Navigation Compose
    - Credentials Manager (Play Services Auth)

## 📦 Cấu trúc thư mục

- `SignIn.kt`: Màn hình đăng nhập.
- `SignUp.kt`: Màn hình đăng ký tài khoản.
- `HomeScreen.kt`: Màn hình chính sau khi đăng nhập thành công.
- `MainActivity.kt`: Điểm khởi đầu của ứng dụng và cấu hình Navigation.

## ⚙️ Hướng dẫn cài đặt

1.  **Clone project**:
    ```bash
    git clone https://github.com/your-username/LoginSignup.git
    ```
2.  **Thiết lập Firebase**:
    - Truy cập [Firebase Console](https://console.firebase.google.com/).
    - Tạo một dự án mới.
    - Thêm ứng dụng Android với package name: `com.example.loginsignup`.
    - Tải file `google-services.json` và đặt vào thư mục `app/`.
    - Bật tính năng **Email/Password Authentication** trong Firebase Console.
3.  **Chạy ứng dụng**:
    - Mở project bằng Android Studio.
    - Sync Gradle và nhấn **Run**.

## 📸 Ảnh chụp màn hình

*(Bạn có thể thêm hình ảnh minh họa tại đây)*

---
Được phát triển với ❤️ bởi qank0.

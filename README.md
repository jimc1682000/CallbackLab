# CallbackLab

## 這是什麼 (What)

CallbackLab 是一個 Java Callback 設計模式的學習專案。這個專案示範了如何在 Java 中實作和使用 Callback 介面，透過 Teacher-Student 互動模式來展示 Callback 的工作原理。

## 為什麼需要這個 (Why)

- **學習目的**: 理解 Java 中 Callback 設計模式的實作方式
- **設計模式實踐**: 提供具體的程式碼範例來學習 Callback 模式
- **程式設計教學**: 適合作為 Java 進階程式設計的教學材料
- **非同步程式設計基礎**: 為學習更複雜的非同步程式設計打下基礎

## 如何使用 (How)

### 系統需求

- Java 8 或更高版本
- IDE (如 Eclipse、IntelliJ IDEA) 或文字編輯器

### 編譯和執行

1. 複製專案到本地端
```bash
git clone https://github.com/jimc1682000/CallbackLab.git
cd CallbackLab
```

2. 編譯 Java 檔案
```bash
javac -d bin src/tw/com/jimmy/lab/*.java
```

3. 執行程式
```bash
java -cp bin tw.com.jimmy.lab.ClassRoom
```

### 專案結構

```
CallbackLab/
├── src/tw/com/jimmy/lab/
│   ├── Callback.java      # Callback 介面定義
│   ├── Teacher.java       # 教師類別，執行 callback
│   ├── Student.java       # 學生類別，實作 callback
│   └── ClassRoom.java     # 主程式，示範使用方式
├── bin/                   # 編譯後的 class 檔案
└── README.md             # 專案說明文件
```

### 核心概念

1. **Callback 介面**: 定義回呼方法的契約
2. **實作類別**: Student 實作 Callback 介面
3. **呼叫者**: Teacher 接受 Callback 並在適當時機呼叫
4. **使用範例**: ClassRoom 展示完整的使用流程

## 開發者資訊 (Who)

- **作者**: Jimmy Chen
- **GitHub**: [jimc1682000](https://github.com/jimc1682000)
- **專案類型**: Java 學習專案
- **授權**: MIT License

## 相關資源

- [Java Callback Pattern 說明](https://www.oracle.com/java/)
- [設計模式相關文件](https://refactoring.guru/design-patterns)
- [Java 官方文件](https://docs.oracle.com/javase/)

## 貢獻指南

歡迎提交 Issue 和 Pull Request。請參閱 [CONTRIBUTING.md](CONTRIBUTING.md) 了解詳細的貢獻指南。

## 授權

本專案採用 MIT 授權條款 - 詳見 [LICENSE](LICENSE) 檔案。
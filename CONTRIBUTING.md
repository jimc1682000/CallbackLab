# 貢獻指南 (Contributing Guide)

感謝您對 CallbackLab 專案的關注！我們歡迎任何形式的貢獻。

## 如何貢獻

### 回報問題 (Reporting Issues)

如果您發現了 bug 或有功能建議，請：

1. 先搜尋現有的 issues，確認問題尚未被回報
2. 建立新的 issue，包含以下資訊：
   - 清楚的標題和描述
   - 重現步驟（針對 bug）
   - 預期行為和實際行為
   - 環境資訊（Java 版本、作業系統等）
   - 相關的錯誤訊息或截圖

### 程式碼貢獻 (Code Contributions)

#### 開發環境設定

1. Fork 本專案到您的 GitHub 帳號
2. Clone 您的 fork 到本地端
```bash
git clone https://github.com/[您的用戶名]/CallbackLab.git
cd CallbackLab
```
3. 設定上游倉庫
```bash
git remote add upstream https://github.com/jimc1682000/CallbackLab.git
```

#### 分支命名規範

請根據貢獻類型使用以下分支命名格式：

- **功能開發**: `feature/功能描述`
  - 例如: `feature/add-async-callback`
  - 例如: `feature/improve-error-handling`

- **錯誤修復**: `bugfix/錯誤描述`
  - 例如: `bugfix/fix-null-pointer-exception`
  - 例如: `bugfix/resolve-callback-timeout`

- **緊急修復**: `hotfix/緊急問題描述`
  - 例如: `hotfix/security-vulnerability`
  - 例如: `hotfix/critical-callback-failure`

- **文件更新**: `docs/文件描述`
  - 例如: `docs/update-readme`
  - 例如: `docs/add-api-documentation`

- **重構**: `refactor/重構描述`
  - 例如: `refactor/simplify-callback-interface`
  - 例如: `refactor/improve-code-structure`

#### Pull Request 流程

1. 建立適當命名的分支
```bash
git checkout -b feature/您的功能描述
```

2. 進行開發並遵循編碼規範
3. 撰寫或更新測試（如適用）
4. 確保程式碼通過所有測試
```bash
javac -d bin src/tw/com/jimmy/lab/*.java
java -cp bin tw.com.jimmy.lab.ClassRoom
```

5. 提交變更，撰寫清楚的 commit 訊息
```bash
git add .
git commit -m "功能: 新增非同步 callback 支援"
```

6. 推送分支並建立 Pull Request
```bash
git push origin feature/您的功能描述
```

7. 在 Pull Request 中提供：
   - 變更摘要
   - 測試說明
   - 相關 issue 連結（如有）
   - 螢幕截圖（如適用）

## 編碼規範

### Java 編碼標準

- 遵循 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- 使用 4 個空格進行縮排
- 類別名稱使用 PascalCase
- 方法和變數名稱使用 camelCase
- 常數使用 SCREAMING_SNAKE_CASE

### 注釋規範

```java
/**
 * 簡短描述方法功能
 * 
 * @param callback 回呼函數接口
 * @param question 問題字串
 * @return 處理結果
 */
public String executeMessage(Callback callback, String question) {
    // 實作邏輯
}
```

### 命名慣例

- 介面名稱以描述功能命名（如 `Callback`）
- 實作類別名稱應清楚表達其角色（如 `Student`, `Teacher`）
- 方法名稱使用動詞開頭（如 `solve`, `execute`）

## 測試指南

- 為新功能編寫單元測試
- 確保現有測試持續通過
- 測試覆蓋率應保持在合理水準
- 包含邊界條件和錯誤情況的測試

## 文檔要求

- 更新 README.md（如有新功能或變更）
- 為新的公開 API 提供 JavaDoc
- 更新相關的範例程式碼
- 包含使用說明和最佳實踐

## 審核流程

1. **自動檢查**: GitHub Actions 會自動執行測試
2. **程式碼審核**: 維護者會審核您的程式碼
3. **討論和改進**: 根據反饋進行修改
4. **合併**: 通過審核後將合併到主分支

## 版本發布

本專案遵循 [語意化版本](https://semver.org/lang/zh-TW/) 規範：

- **主版本**：不相容的 API 變更
- **次版本**：向下相容的功能新增
- **修訂版本**：向下相容的錯誤修復

## 社群準則

- 保持友善和尊重的態度
- 歡迎新手和各種經驗水準的貢獻者
- 建設性的反饋和討論
- 遵循 [行為準則](CODE_OF_CONDUCT.md)

## 聯繫方式

如有任何問題，歡迎：
- 開立 GitHub Issue
- 發送 email 至 13607952+jimc1682000@users.noreply.github.com

感謝您的貢獻！
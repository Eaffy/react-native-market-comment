# react-native-market-comment
### 打开应用市场进行评论。iOS: 跳转 AppStore 评论页; Android: 跳出所有本机已安装应用市场列表，点击跳转对应市场 App评论页。
#### Installing
`npm install react-native-market-comment --save`
#### Lingking Native Dependencies
`react-naitve link react-native-market-comment`
#### Usage
`import openAppStoreToComment from 'react-native-market-comment';`
```
didClickCommentButton = () => {
  openAppStoreToComment();
}
```
#### API
* openAppStoreToComment(yourAppIdOnAppStore)

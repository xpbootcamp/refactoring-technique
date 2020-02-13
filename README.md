# Refactor kit

[![Build Status](https://travis-ci.org/xp-bootcamp/refactor-kit.svg?branch=master)](https://travis-ci.org/xp-bootcamp/refactor-kit)
 

## 开发环境
 - JDK1.8+

## Hello World
影片租赁销售机，重构过程依次涉及的重构手法：

1. Extract Method（提炼方法）
2. Inline Temp（内联变量）
3. Rename Variable（重命名变量）
4. Move Method + Rename method（移动方法）
5. Replace Temp with Query（以查询取代临时变量）
6. Form Template Method（构造模板方法）
7. Replace Type Code with State/Strategy（以State/Strategy取代类型码）
8. Replace Conditional with Polymorphism（以多态取代条件表达式）
9. Self Encapsulate Field（自封装字段）

 
## Kit列表
1. EM: Extract Method
2. RTWQ: Replace Temp with Query
3. STV: Split Temporary Variable
4. RMWMO: Replace Method with Method Object
5. MM: Move Method
6. MF: Move Field
7. RDVWO: Replace Data Value with Object
8. CVTR: Change Value to Reference
9. CRTV: Change Reference to Value
10. RAWO: Replace Array with Object
11. RTCWS: Replace Type Code with Subclass
12. RTCWS/S: Replace Type Code with State/Strategy
13. RNCWGC: Replace Nested Conditional with Guard Clauses


## 参考资料
- [JUnit 5用户指南](https://sjyuan.club/junit5/user-guide-cn/)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)
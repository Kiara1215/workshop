

# 1. 数学
## 1.1. 数字转换
#### 1.1.1. 12.整数转罗马数字
#### 1.1.2. 13.罗马数字转整数
#### 1.1.3. 273.整数转英文表示
#### 1.1.4. 补充题.阿拉伯数字转中文
#### 1.1.5. 补充题.中文转阿拉伯数字

## 1.2. 字符串四则运算
#### 1.2.1. 415.字符串相加
#### 1.2.2. 补充题.字符串相减
#### 1.2.3. 43.字符串相乘
#### 1.2.4. 166.分数到小数
#### 1.2.5. 2.两数相加
#### 1.2.6. 445.两数相加II
#### 1.2.7. 989.数组形式的整数加法

## 1.3. 位运算
### 1.3.1. 求余
NOTE：任意正整数对2^n求余，等于该数与(2^n-1)按位与。X % 2^n  = X & (2^n - 1)

### 1.3.2. 位与
NOTE：n & (n-1)消除n末尾的1
#### 1.3.2.1. 191.位1的个数
#### 1.3.2.2. 231.2的幂

### 1.3.3. 倍增
NOTE：左移实现倍增，可用于实现快速乘法
#### 1.3.3.1. 29.两数相除

### 1.3.4. 异或
NOTE：相同数字的异或结果为0，任何数字与0异或的结果为该数字本身
#### 1.3.4.1. 268.丢失的数字
#### 1.3.4.2. 389.找不同
#### 1.3.4.3. 136.只出现一次的数字
#### 1.3.4.4. 137.只出现一次的数字II
#### 1.3.4.5. 260.只出现一次的数字III
#### 1.3.4.6. 540.有序数组中的单一元素
NOTE：用异或解题时间复杂度无法满足，因为没有利用数组有序的条件

## 1.4. 求模
NOTE：(a * b) % k = (a % k) * (b % k) % k
#### 1.4.1. 372.超级次方

## 1.5. 求幂
#### 1.5.1. 50.Pow(x, n)
NOTE：快速幂，分治
#### 1.5.2. 372.超级次方

## 1.6. 阶乘
#### 1.6.1. 172.阶乘后的零

## 1.7. 质数
#### 1.7.1. 204.计数质数
NOTE：厄拉多塞筛法

## 1.8. 随机数
#### 1.8.1. 470.用Rand7()实现Rand10()
NOTE：等概率随机数：放大等概率随机数 + 拒绝采样
#### 1.8.2. 380.O(1)时间插入、删除和获取随机元素
#### 1.8.3. 710.黑名单中的随机数
#### 1.8.4. 382.链表随机节点
#### 1.8.5. 398.随机数索引

## 1.9. 找规律
#### 1.9.1. 400.第N位数字
#### 1.9.2. 233.数字1的个数


# 2. 链表
## 2.1. 快慢指针
#### 2.1.1. 83.删除排序链表中的重复元素


# 3. 数组
## 3.1. 双指针
#### 3.1.1. 88.合并两个有序数组
#### 3.1.2. 977.有序数组的平方

### 3.1.1. 快慢指针
#### 3.1.3. 26.删除有序数组中的重复项
#### 3.1.4. 27.移除元素
#### 3.1.5. 283.移动零
#### 3.1.6. 344.反转字符串(反转字符串II)
#### 3.1.7. 345.反转字符串中的元音字母
#### 3.1.8. 557.反转字符串中的单词II

### 3.1.2. 滑动窗口
#### 3.1.9. 3.无重复字符的最长子串
#### 3.1.10. 76.最小覆盖子串
#### 3.1.11. 567.字符串的排列(同438)
#### 3.1.12. 438.找到字符串中所有字母异位词(同567)
#### 3.1.13. 209.长度最小的子数组(862)
#### 3.1.14. 1438.绝对差不超过限制的最长连续子数组

### 3.1.3. 左右指针
#### 3.1.15. 167.两数之和II
#### 3.1.16. 240.搜索二维矩阵
#### 3.1.17. 11.盛水最多的容器
#### 3.1.18. 541.反转字符串II
#### 3.1.19. 5.最长回文子串

## 3.2. 原地哈希
#### 3.2.1. 268.丢失的数字
#### 3.2.2. 41.缺失的第一个正数
#### 3.2.3. 442.数组中重复的数据
#### 3.2.4. 448.找到所有数组中消失的数字
#### 3.2.5. 287.寻找重复数字
#### 3.2.6. 645.错误的集合

## 3.3. 区间
#### 3.3.1. 56.合并区间(763.划分字母区间)
#### 3.3.2. 57.插入区间
#### 3.3.3. 435.无重叠区间
#### 3.3.4. 452.用最少数量的箭引爆气球
#### 3.3.5. 252.会议室I
#### 3.3.6. 253.会议室II

## 3.4. 区间和
### 3.4.1. 前缀和数组
NOTE：数组不变，求区间和
#### 3.4.1.1. 303.区域和检索-数组不可变
#### 3.4.1.2. 304.二维区域和检索-数组不可变
#### 3.4.1.3. 437.路径总和III
#### 3.4.1.4. 525.连续数组
#### 3.4.1.5. 523.连续的子数组和
#### 3.4.1.6. 560.和为k的子数组
#### 3.4.1.7. 325.和等于k的最长子数组长度
#### 3.4.1.8. 974.和可被k整除的子数组

### 3.4.2. 差分数组
NOTE：区间更新，单点查询（多次修改某个区间，求最终结果）
#### 3.4.2.1. 370.区间加法
#### 3.4.2.2. 1094.拼车
#### 3.4.2.3. 1109.航班预订统计

### 3.4.3. 树状数组(index tree)
NOTE：单点更新，区间查询（多次修改某个元素，求区间和）
#### 3.4.3.1. 307.区域和检索-数组可修改
#### 3.4.3.2. 308.二维区域和检索-数组可修改

### 3.4.4. 线段树
NOTE：区间更新，区间查询（多次修改某个区间，求区间和）

### 3.4.5. 传统数组
NOTE：单点更新，单点查询


# 4. 字符串
## 4.1. 字符串匹配算法：BF、BM、KMP、RabinKarp
#### 4.1.1. 28.找出字符串下一个匹配项的下标

## 4.2. 滑动哈希
#### 4.2.1. 187.重复的DNA序列
#### 4.2.2. 1044.最长重复子串


# 5. 栈
## 5.1. 基础
#### 5.1.1. 155.最小栈
#### 5.1.2. 232.用栈实现队列(剑指offer-9.用两个栈实现队列)
#### 5.1.3. 946.验证栈序列(剑指offer-31.栈的压入、弹出序列)
#### 5.1.4. 补充题24.双栈排序
#### 5.1.5. 面试题03.05.栈排序

## 5.2. 应用
#### 5.2.1. 20.有效的括号
#### 5.2.2. 1190.反转每对括号间的子串
#### 5.2.3. 150.逆波兰表达式求值
#### 5.2.4. 224.基本计算器
#### 5.2.5. 227.基本计算器II
#### 5.2.6. 772.基本计算器III
#### 5.2.7. 770.基本计算器IV
#### 5.2.8. 394.字符串解码

## 5.3. 单调栈
#### 5.3.1. 496.下一个更大元素
#### 5.3.2. 503.下一个更大元素II(循环数组)
#### 5.3.3. 739.每日温度
#### 5.3.4. 901.股票价格跨度
#### 5.3.5. 456.132模式
#### 5.3.6. 1124.表现良好的最长时间段
#### 5.3.7. 1475.商品折扣后的最终价格
#### 5.3.8. 84.柱状图中的最大矩形
#### 5.3.9. 85.最大矩形
#### 5.3.10. 316.去除重复字母
#### 5.3.11. 1081.不同字符的最小子序列


# 6. 队列
## 6.1. 基础
#### 6.1.1. 225.用队列实现栈(基础：用两个队列实现；进阶：用一个队列实现)

## 6.2. 优先队列
#### 6.2.1. 347.前K个高频元素

## 6.3. 单调队列
#### 6.3.1. 剑指offer-59.队列的最大值
#### 6.3.2. 239.滑动窗口最大值
#### 6.3.3. 862.和至少为k的子数组(209.长度最小的子数组)
#### 6.3.4. 1438.绝对差不超过限制的最长连续子数组


# 7. 二叉树
## 7.1. 从遍历序列构建：关键是找能区分左右子树的节点下标
#### 7.1.1. 105.从前序和中序遍历序列构造二叉树
#### 7.1.2. 106.从中序和后序遍历序列构造二叉树
#### 7.1.3. 889.从前序和后续遍历序列构造二叉树

## 7.2. 遍历
#### 7.2.1. 103.二叉树的锯齿形层序遍历

## 7.3. 路径
#### 7.3.1. 112.路径总和
#### 7.3.2. 113.路径总和II
#### 7.3.3. 437.路径总和III
#### 7.3.4. 666.路径总和IV(https://zhuanlan.zhihu.com/p/441264789?utm_id=0)


# 8. 图
## 8.1. 并查集
#### 8.1.1. 323.无向图中连通分量的数量
#### 8.1.2. 990.等式方程的可满足性
#### 8.1.3. 547.省份数量
#### 8.1.4. 261.以图判树(https://www.lintcode.com/problem/178/)
#### 8.1.5. 1319.连通网络的操作次数

## 8.2. 最小生成树：Kruskal/Prim
#### 8.2.1. 1135.最低成本连通所有城市
#### 8.2.2. 1584.连接所有点的最小费用

## 8.3. Dijkstra算法：有向正权图
#### 8.3.1. 743.网络延迟时间
#### 8.3.2. 1631.最小体力消耗路径
#### 8.3.3. 1514.概率最大路径


# 9. 数据结构设计
#### 9.1. 705.设计哈希集合
#### 9.2. 706.设计哈希映射
#### 9.3. 341.扁平化嵌套列表迭代器

# 10. 排序
## 10.1. 归并排序
#### 10.1.1. 补充题：手撕归并排序
#### 10.1.2. 补充题：计算数组的小和
#### 10.1.3. 剑指offer51.数组中的逆序对
#### 10.1.4. 315.计算右侧小于当前元素的个数

## 10.2. 快速排序


# 11. 二分查找
本质：二段性，而不是单调性，单调性只是二段性的特殊情况。

## 11.1. 排序数组
#### 11.1.1. 704.二分查找
#### 11.1.2. 34.在排序数组中查找元素的第一和最后一个位置
#### 11.1.3. 35.搜索插入位置

## 11.2. 旋转排序数组
#### 11.2.1. 153.寻找旋转排序数组最小值(无重复数字)
#### 11.2.2. 154.寻找旋转排序数组最小值II(有重复数字)
#### 11.2.3. 33.搜索旋转排序数组(无重复数字)
#### 11.2.4. 81.搜索旋转排序数组(有重复数字)
#### 11.2.5. 面试题10.03.搜索旋转排序数组(有重复数字)

## 11.3. 二维数组
#### 11.3.1. 74.搜索二维矩阵
#### 11.3.2. 240.搜索二维矩阵II
#### 11.3.3. 378.有序矩阵中第K小的元素(值域二分)

## 11.4. 需要挖掘单调性
#### 11.4.1. 69.x的平方根(NOTE：如果要求精确到小数点后x位，该怎么做？)
#### 11.4.2. 287.寻找重复数
#### 11.4.3. 540.有序数组中的单一元素
#### 11.4.4. 410.分割数组的最大值
#### 11.4.5. 875.爱吃香蕉的珂珂
#### 11.4.6. 1011.在D天内送达包裹的能力
#### 11.4.7. 1095.山脉数组中查找目标值
#### 11.4.8. 300.最长递增子序列
#### 11.4.9. 354.俄罗斯套娃信封问题
#### 11.4.10. 528.按权重随机选择
#### 11.4.11. 1044.最长重复子串


# 12. DFS/BFS
DFS-找所有可能 / BFS-找最短路径

## 12.1. 二分图
#### 12.1.1. 785.判断二分图
#### 12.1.2. 866.可能的二分法

## 12.2. 深度优先搜索-DFS：回溯
#### 12.2.1. 22.括号生成
#### 12.2.2. 301.删除无效的括号
#### 12.2.3. 282.给表达式添加运算符
#### 12.2.4. 797.所有可能的路径
#### 12.2.5. 79.单词搜索

## 12.3. 广度优先遍历-BFS
#### 12.3.1. 111.二叉树最小深度
#### 12.3.2. 752.打开转盘锁
#### 12.3.3. 773.滑动谜题
#### 12.3.4. 127.单词接龙
#### 12.3.5. 994.腐烂的橘子
#### 12.3.6. 490.迷宫
#### 12.3.7. 505.迷宫II
#### 12.3.8. 200.岛屿数量
#### 12.3.9. 132.被围绕的区域
#### 12.3.10. 696.岛屿的最大面积
#### 12.3.11. 827.最大人工岛
#### 12.3.12. 463.岛屿的周长


# 13. 贪心
#### 13.1. 763.划分字母区间


# 14. 动态规划

## 14.1. fib
#### 14.1.1. 509.斐波那契数
#### 14.1.2. 70.爬楼梯
#### 14.1.3. 746.使用最小花费爬楼梯
#### 14.1.4. 1137.第N个泰波那契数
#### 14.1.5. 91.解码方法(剑指offer165.解密数字)
#### 14.1.6. 343.整数拆分(剑指offer131.剪绳子；剑指offer132.剪绳子II)

## 14.2. 背包问题
### 14.2.1. 01背包
#### 14.2.1.1. 416.分割等和子集

### 14.2.2. 完全背包
#### 14.2.2.1. 322.零钱兑换(剑指offer103.最少的硬币数目)
#### 14.2.2.2. 518.零钱兑换II

## 14.3. 子序列
#### 14.3.1. 300.最长递增子序列
#### 14.3.2. 354.俄罗斯套娃信封问题
#### 14.3.3. 53.最大子数组和
#### 14.3.4. 72.编辑距离

## 14.4. 股票

## 14.5. 打家劫舍
#### 14.5.1. 198.打家劫舍
#### 14.5.2. 213.打家劫舍II
#### 14.5.3. 337.打家劫舍III(二叉树遍历-DFS)

## 14.6. 丑数
#### 14.6.1. 263.丑数
#### 14.6.2. 264.丑数II
#### 14.6.3. 313.超级丑数


# 15. 脑筋急转弯
#### 15.1. 292.Nim游戏
#### 15.2. 877.石子游戏
#### 15.3. 319.灯泡开关
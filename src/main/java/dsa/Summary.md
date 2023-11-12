

# 1. 数学
## 1.1. 数字转换
12.整数转罗马数字
13.罗马数字转整数
273.整数转英文表示
补充题.阿拉伯数字转中文
补充题.中文转阿拉伯数字

## 1.2. 字符串(大数)四则运算
415.字符串相加
补充题.字符串相减
43.字符串相乘
166.分数到小数
2.两数相加
445.两数相加II
989.数组形式的整数加法

## 1.3. 位运算
### 1.3.1. 求余：任意正整数对2^n求余，等于该数与(2^n-1)按位与。X % 2^n  = X & (2^n - 1)

### 1.3.2. 倍增：左移实现倍增，可用于实现快速乘法
29.两数相除

### 1.3.3. 异或：相同数字的异或结果为0，任何数字与0异或的结果为该数字本身
268.丢失的数字
389.找不同
136.只出现一次的数字
137.只出现一次的数字II
260.只出现一次的数字III
540.有序数组中的单一元素(用异或解题时间复杂度无法满足，因为没有利用数组有序的条件)

## 1.4. 质数
204.计数质数(厄拉多塞筛法)

## 1.5. 随机数
470.用Rand7()实现Rand10()，(等概率随机数：放大等概率随机数 + 拒绝采样)
380.O(1)时间插入、删除和获取随机元素
710.黑名单中的随机数
382.链表随机节点
398.随机数索引


# 2. 链表
## 2.1. 快慢指针
83.删除排序链表中的重复元素


# 3. 数组
## 3.1. 双指针
88.合并两个有序数组
977.有序数组的平方

### 3.1.1. 快慢指针
26.删除有序数组中的重复项
27.移除元素
283.移动零
344.反转字符串(反转字符串II)
345.反转字符串中的元音字母
557.反转字符串中的单词II

### 3.1.2. 滑动窗口
3.无重复字符的最长子串
76.最小覆盖子串
567.字符串的排列(同438)
438.找到字符串中所有字母异位词(同567)
209.长度最小的子数组(862)
1438.绝对差不超过限制的最长连续子数组

### 3.1.3. 左右指针
167.两数之和II
240.搜索二维矩阵
11.盛水最多的容器
541.反转字符串II
5.最长回文子串

## 3.2. 原地哈希
268.丢失的数字
41.缺失的第一个正数
442.数组中重复的数据
448.找到所有数组中消失的数字
287.寻找重复数字

## 3.3. 区间
56.合并区间(763.划分字母区间)
57.插入区间
435.无重叠区间
452.用最少数量的箭引爆气球
252.会议室I
253.会议室II

## 3.4. 区间和
### 3.4.1. 前缀和数组：数组不变，求区间和
303.区域和检索-数组不可变
304.二维区域和检索-数组不可变
437.路径总和III
525.连续数组
523.连续的子数组和
560.和为k的子数组
325.和等于k的最长子数组长度
974.和可被k整除的子数组

### 3.4.2. 差分数组：区间更新，单点查询（多次修改某个区间，求最终结果）
370.区间加法
1094.拼车
1109.航班预订统计

### 3.4.3. 树状数组(index tree)：单点更新，区间查询（多次修改某个元素，求区间和）
307.区域和检索-数组可修改
308.二维区域和检索-数组可修改

### 3.4.4. 线段树：区间更新，区间查询（多次修改某个区间，求区间和）

### 3.4.5. 传统数组：单点更新，单点查询


# 4. 字符串
## 4.1. 字符串匹配算法：BF、BM、KMP、RabinKarp
28.找出字符串下一个匹配项的下标

## 4.2. 滑动哈希
187.重复的DNA序列
1044.最长重复子串


# 5. 栈
## 5.1. 基础
155.最小栈
232.用栈实现队列(剑指offer-9.用两个栈实现队列)
946.验证栈序列(剑指offer-31.栈的压入、弹出序列)
补充题24.双栈排序
面试题03.05.栈排序

## 5.2. 应用
20.有效的括号
1190.反转每对括号间的子串
150.逆波兰表达式求值
224.基本计算器
227.基本计算器II
772.基本计算器III
770.基本计算器IV
394.字符串解码

## 5.3. 单调栈
496.下一个更大元素
503.下一个更大元素II(循环数组)
739.每日温度
901.股票价格跨度
456.132模式
1124.表现良好的最长时间段
1475.商品折扣后的最终价格
84.柱状图中的最大矩形
85.最大矩形
316.去除重复字母
1081.不同字符的最小子序列


# 6. 队列
## 6.1. 基础
225.用队列实现栈(基础：用两个队列实现；进阶：用一个队列实现)

## 6.2. 优先队列
347.前K个高频元素

## 6.3. 单调队列
剑指offer-59.队列的最大值
239.滑动窗口最大值
862.和至少为k的子数组(209.长度最小的子数组)
1438.绝对差不超过限制的最长连续子数组


# 7. 二叉树
## 7.1. 从遍历序列构建：关键是找能区分左右子树的节点下标
105.从前序和中序遍历序列构造二叉树
106.从中序和后序遍历序列构造二叉树
889.从前序和后续遍历序列构造二叉树

## 7.2. 遍历
103.二叉树的锯齿形层序遍历

## 7.3. 路径
112.路径总和
113.路径总和II
437.路径总和III
666.路径总和IV(https://zhuanlan.zhihu.com/p/441264789?utm_id=0)


# 8. 图
## 8.1. 并查集
323.无向图中连通分量的数量
990.等式方程的可满足性
547.省份数量
261.以图判树(https://www.lintcode.com/problem/178/)

## 8.2. 最小生成树：Kruskal/Prim
1135.最低成本连通所有城市
1584.连接所有点的最小费用

## 8.3. Dijkstra算法：有向正权图
743.网络延迟时间
1631.最小体力消耗路径
1514.概率最大路径


# 9. 数据结构设计
705.设计哈希集合
706.设计哈希映射


# 10. 排序
## 10.1. 归并排序
补充题：手撕归并排序
补充题：计算数组的小和
剑指offer51.数组中的逆序对
315.计算右侧小于当前元素的个数

## 10.2. 快速排序


# 11. 二分查找
本质：二段性，而不是单调性，单调性只是二段性的特殊情况。

## 11.1. 排序数组
704.二分查找
34.在排序数组中查找元素的第一和最后一个位置
35.搜索插入位置

## 11.2. 旋转排序数组
153.寻找旋转排序数组最小值(无重复数字)
154.寻找旋转排序数组最小值II(有重复数字)
33.搜索旋转排序数组(无重复数字)
81.搜索旋转排序数组(有重复数字)
面试题10.03.搜索旋转排序数组(有重复数字)

## 11.3. 二维数组
74.搜索二维矩阵
240.搜索二维矩阵II
378.有序矩阵中第K小的元素(值域二分)

## 11.4. 需要挖掘单调性
287.寻找重复数
540.有序数组中的单一元素
410.分割数组的最大值
875.爱吃香蕉的珂珂
1095.山脉数组中查找目标值
300.最长递增子序列
354.俄罗斯套娃信封问题
528.按权重随机选择
1044.最长重复子串


# 12. DFS/BFS
DFS-找所有可能 / BFS-找最短路径

## 12.1. 二分图
785.判断二分图
866.可能的二分法

## 12.2. 深度优先搜索-DFS：回溯
22.括号生成
301.删除无效的括号
282.给表达式添加运算符
797.所有可能的路径
79.单词搜索

## 12.3. 广度优先遍历-BFS
111.二叉树最小深度
752.打开转盘锁
773.滑动谜题
127.单词接龙
994.腐烂的橘子
490.迷宫
505.迷宫II
200.岛屿数量
132.被围绕的区域
696.岛屿的最大面积
827.最大人工岛
463.岛屿的周长


# 13. 贪心
763.划分字母区间


# 动态规划
## 背包问题
### 01背包
416.分割等和子集

### 完全背包
322.零钱兑换
518.零钱兑换II

## 爬楼梯
91.解码方法
剑指offer165.解密数字
343.整数拆分(剑指offer131.剪绳子)

## 股票

## 打家劫舍
198.打家劫舍
213.打家劫舍II
337.打家劫舍III(二叉树遍历-DFS)

## 丑数
263.丑数
264.丑数II
313.超级丑数

## 子序列
53.最大子数组和
300.最长递增子序列


# 14. 脑筋急转弯
292.Nim游戏
setA = set([1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 4])
print(setA)

setA.add(10)
print(setA)

setA.update([11, 12, 13, 10])
print(setA)

setA.discard(7)
print(setA)

setA.discard(100)
print(setA)

setA.remove(10)
print(setA)

shallow_copy_of_setA = setA.copy()
print("shallow copy -> ", shallow_copy_of_setA)

shallow_copy_of_setA.add(14)
print("shallow copy -> ", shallow_copy_of_setA)
print("setA -> ", setA)

print(setA.pop())

setB = set()
setB.update([5, 6, 7, 8, 9, 10, 11])
print (setA & setB)
print(setA.intersection(setB))
print(setA.difference(setB))
print(setB.difference(setA))
print(setA.isdisjoint(setB))

setC = set()
setC.update([100,101, 102])
print(setC.isdisjoint(setA))

setA.difference_update(setB)
print(setA)

print(setA.issubset(setB))
print(setB.issubset(setA))
print(setB.isdisjoint(setA))

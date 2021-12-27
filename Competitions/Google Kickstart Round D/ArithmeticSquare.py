cases = []
inp = input()
for i in range(int(inp)):
	# for j in range(3):
	a = input().split()
	b = input().split()
	c = input().split()
	cases.append([a,b,c])

# a =[4,1,6]
# b =[3,0,5]
# c =[2,5,6]
#Trivial
#Row 0 across:
def foo(rz:list, rf:list, rs:list):
	trivialcounter = 0 
	if ((int(rz[1]) - int(rz[0])) == (int(rz[2])-int(rz[1]))): 
		trivialcounter += 1
		# print(1)
	#Row 2 across:
	if ((int(rs[1]) - int(rs[0])) == (int(rs[2])-int(rs[1]))): 
		trivialcounter += 1
		# print(2)
	#Column 0:
	if ((int(rf[0]) - int(rz[0])) == (int(rs[0])-int(rf[0]))): 
		trivialcounter += 1
		# print(3)
	#Column 2:
	if ((int(rf[1]) - int(rz[2])) == (int(rs[2])-int(rf[1]))): 
		trivialcounter += 1
		# print(4)

	all_counts = []
	for y in range(-50,51):
		counter = 0
		#Row 1:
		if ((y - int(rf[0])) == (int(rf[1])- y)): 
			counter += 1
			# print(5)
		#Col 1:
		if ((y - int(rz[1])) == (int(rs[1])- y)): 
			counter += 1
			# print(6)
		#diag left right:
		if ((y - int(rz[0])) == (int(rs[2])- y)): 
			counter += 1
			# print(7)
		#diag right left:
		if ((y - int(rs[0])) == (int(rz[2])- y)): 
			counter += 1
			# print(8)
		all_counts.append(counter)
	return(trivialcounter + max(all_counts))
# print(all_counts)
# print(trivialcounter)
# print(max(all_counts))
# print(trivialcounter + max(all_counts))
# print(foo(a,b,c))
# print(cases)
for k in range(int(inp)):
	print(f"Case #{k+1}: " + str(foo(cases[k][0],cases[k][1], cases[k][2])))

def mergedivide(arr):
  if(len(arr))<=1:
    return arr
    
  mid=len(arr)//2
  lefthalf=arr[:mid]
  righthalf=arr[mid:]
  
  sortedleft=mergedivide(lefthalf)
  sortedright=mergedivide(righthalf)
  
  return merge(sortedleft,sortedright)
  
def merge(lefthalf,righthalf):
  result=[]
  i=j=0
  while(i<len(lefthalf) and j<len(righthalf)):
    if(lefthalf[i]<righthalf[j]):
      result.append(lefthalf[i])
      i+=1;
    else:
      result.append(righthalf[j])
      j+=1;
      
  result.extend(lefthalf[i:])
  result.extend(righthalf[j:])
  
  return result

arr=[3, 7, 6, -10, 15, 23.5, 55, -13]
print(mergedivide(arr))
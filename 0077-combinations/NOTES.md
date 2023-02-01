class Solution {
public List<List<Integer>> combine(int n, int k) {
List<List<Integer>> ans=new ArrayList<>();
List<Integer> ll=new ArrayList<>();
combination(n,k,0,1,ans,ll);
return ans;
}
public static void combination(int n,int k,int count,int j,List<List<Integer>> ans,List<Integer> ll)
{
// if(count>k)     // we can remove it also
//     return;
if(count==k)
{
ans.add(new ArrayList<>(ll));
return;
}
for(int i=j;i<=n;i++)
{
ll.add(i);
combination(n,k,count+1,i+1,ans,ll);
ll.remove(ll.size()-1);
}
}
}
class NumberContainers {
    Map<Integer, Integer> idxToNum;
    Map<Integer, PriorityQueue<Integer>> numToIdx;

    public NumberContainers() {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }
    
    public void change(int index, int number) {
        idxToNum.put(index, number);
        if(!numToIdx.containsKey(number)) numToIdx.put(number, new PriorityQueue<>());
        numToIdx.get(number).add(index);
    }
    
    public int find(int number) {
        PriorityQueue<Integer> heap = numToIdx.get(number);
        if(heap == null) return -1;
        while(!heap.isEmpty()){
            int curr = heap.peek();
            if(idxToNum.get(curr) == number) return curr;
            heap.poll();
        }
        return -1;
        
    }
}

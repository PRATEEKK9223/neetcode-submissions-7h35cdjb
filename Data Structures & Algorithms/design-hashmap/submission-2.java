class MyHashMap {

    private Entity[] entities;
    private int DEFAULT=16;

    public MyHashMap() {
        entities=new Entity[DEFAULT];
    }

    private class Entity{
        int key;
        int value;

        public Entity(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    
    public void put(int key, int value) {
        if(entities.length==DEFAULT){
            this.DEFAULT=DEFAULT*2;
            Entity[] newEntites=new Entity[DEFAULT];
            int i=0;
            while(i<entities.length){
                newEntites[i]=entities[i];
                i++;
            }
            entities=newEntites;
        }
        int hash=key % entities.length;
        entities[hash]=new Entity(key,value);
    }
    
    public int get(int key) {
        int hash=key % entities.length;
        if(entities[hash]==null){
            return -1;
        }
        return entities[hash].value;
    }
    
    public void remove(int key) {
        int hash=key % entities.length;
        if(entities[hash]!=null){
            entities[hash]=null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
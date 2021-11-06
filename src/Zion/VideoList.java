package Zion;


public class VideoList {

    private Video[] videos;
    private int size;

    public VideoList() {
        this.videos = new Video[10];
        this.size = 0;
    }

    public void add(Video o) {
        if (videos[(size - 1)] != null)
            resize();
        for (int i = 0; i < this.size(); i++) {
            if (videos[i] == null) {
                videos[i] = o;
                size++;
            }
        }
    }

    public int size() {
        return size;
    }

    private Video[] resize() {
        Video[] v1 = new Video[videos.length * 2];
        int i = 0;
        for (Video v : videos) {
            v1[i] = v;
            i++;
        }
        return v1;
    }
//
//    @Override
//    public String toString() {
//        for (Video v : videos)
//            return v +"\n-----------------------";
//}
}
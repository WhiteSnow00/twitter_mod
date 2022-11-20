// 
// Decompiled by Procyon v0.6.0
// 

public interface eyd<T>
{
    void a(final int p0, final int p1, final qsb<? super a<? extends T>, fzv> p2);
    
    a<T> get(final int p0);
    
    int getSize();
    
    public static final class a<T>
    {
        public final int a;
        public final int b;
        public final T c;
        
        public a(int a, final int b, final T c) {
            this.a = a;
            this.b = b;
            this.c = c;
            final int n = 0;
            if (a < 0) {
                throw new IllegalArgumentException(udu.z("startIndex should be >= 0, but was ", a).toString());
            }
            a = n;
            if (b > 0) {
                a = 1;
            }
            if (a != 0) {
                return;
            }
            throw new IllegalArgumentException(udu.z("size should be >0, but was ", b).toString());
        }
    }
}

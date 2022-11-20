// 
// Decompiled by Procyon v0.6.0
// 

public final class ds0
{
    public static final ds0 a;
    public static final ds0$j b;
    public static final ds0$c c;
    public static final ds0$k d;
    public static final ds0$a e;
    public static final ds0$b f;
    public static final ds0$h g;
    public static final ds0$g h;
    public static final ds0$f i;
    
    static {
        a = new ds0();
        b = new ds0$j();
        c = new ds0$c();
        d = new ds0$k();
        e = new ds0$a();
        f = new ds0$b();
        g = new ds0$h();
        h = new ds0$g();
        i = new ds0$f();
    }
    
    public final void a(int i, final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n = 0;
        int j = 0;
        int n2 = 0;
        while (j < length) {
            n2 += array[j];
            ++j;
        }
        float n3 = (i - n2) / (float)2;
        if (!b) {
            int length2;
            int n4;
            int n5;
            for (length2 = array.length, n4 = 0, i = n; i < length2; ++i, ++n4) {
                n5 = array[i];
                array2[n4] = zyz.n(n3);
                n3 += n5;
            }
        }
        else {
            int n6;
            for (i = array.length - 1; -1 < i; --i) {
                n6 = array[i];
                array2[i] = zyz.n(n3);
                n3 += n6;
            }
        }
    }
    
    public final void b(final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int n = 0;
        int i = 0;
        if (!b) {
            final int length = array.length;
            int n2 = 0;
            int n3 = 0;
            while (i < length) {
                final int n4 = array[i];
                array2[n2] = n3;
                n3 += n4;
                ++i;
                ++n2;
            }
        }
        else {
            int n5 = array.length - 1;
            int n6 = n;
            while (-1 < n5) {
                final int n7 = array[n5];
                array2[n5] = n6;
                n6 += n7;
                --n5;
            }
        }
    }
    
    public final void c(int i, final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n = 0;
        int j = 0;
        int n2 = 0;
        while (j < length) {
            n2 += array[j];
            ++j;
        }
        int n3 = i - n2;
        if (!b) {
            int length2;
            int n4;
            int n5;
            for (length2 = array.length, n4 = 0, i = n; i < length2; ++i, ++n4) {
                n5 = array[i];
                array2[n4] = n3;
                n3 += n5;
            }
        }
        else {
            int n6;
            for (i = array.length - 1; -1 < i; --i) {
                n6 = array[i];
                array2[i] = n3;
                n3 += n6;
            }
        }
    }
    
    public final void d(int n, final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            n3 += array[i];
            ++i;
        }
        float n4;
        if (array.length == 0 ^ true) {
            n4 = (n - n3) / (float)array.length;
        }
        else {
            n4 = 0.0f;
        }
        float n5 = n4 / 2;
        if (!b) {
            final int length2 = array.length;
            n = 0;
            for (int j = n2; j < length2; ++j, ++n) {
                final int n6 = array[j];
                array2[n] = zyz.n(n5);
                n5 += n6 + n4;
            }
        }
        else {
            int n7;
            for (n = array.length - 1; -1 < n; --n) {
                n7 = array[n];
                array2[n] = zyz.n(n5);
                n5 += n7 + n4;
            }
        }
    }
    
    public final void e(int n, final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n2 = 0;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            n3 += array[i];
            ++i;
        }
        final int length2 = array.length;
        final float n4 = 0.0f;
        float n5 = 0.0f;
        float n6;
        if (length2 > 1) {
            n6 = (n - n3) / (float)(array.length - 1);
        }
        else {
            n6 = 0.0f;
        }
        if (!b) {
            final int length3 = array.length;
            n = 0;
            for (int j = n2; j < length3; ++j, ++n) {
                final int n7 = array[j];
                array2[n] = zyz.n(n5);
                n5 += n7 + n6;
            }
        }
        else {
            n = array.length - 1;
            float n8 = n4;
            while (-1 < n) {
                final int n9 = array[n];
                array2[n] = zyz.n(n8);
                n8 += n9 + n6;
                --n;
            }
        }
    }
    
    public final void f(int i, final int[] array, final int[] array2, final boolean b) {
        czd.f((Object)array, "size");
        czd.f((Object)array2, "outPosition");
        final int length = array.length;
        final int n = 0;
        int j = 0;
        int n2 = 0;
        while (j < length) {
            n2 += array[j];
            ++j;
        }
        final float n3 = (i - n2) / (float)(array.length + 1);
        if (!b) {
            final int length2 = array.length;
            float n4 = n3;
            int n5;
            int n6;
            for (n5 = 0, i = n; i < length2; ++i, ++n5) {
                n6 = array[i];
                array2[n5] = zyz.n(n4);
                n4 += n6 + n3;
            }
        }
        else {
            i = array.length - 1;
            float n7 = n3;
            while (-1 < i) {
                final int n8 = array[i];
                array2[i] = zyz.n(n7);
                n7 += n8 + n3;
                --i;
            }
        }
    }
    
    public final ds0.ds0$e g(final float n) {
        return (ds0.ds0$e)new ds0.ds0$i(n, true, (ftb)ds0$m.D0, (rf8)null);
    }
    
    public interface d
    {
        float a();
        
        void b(final lo8 p0, final int p1, final int[] p2, final fve p3, final int[] p4);
    }
    
    public interface l
    {
        float a();
        
        void c(final lo8 p0, final int p1, final int[] p2, final int[] p3);
    }
}

import android.annotation.SuppressLint;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jlb
{
    public static final seg<String, Typeface> a;
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final l7q<String, ArrayList<hk6<a>>> d;
    
    static {
        a = new seg(16);
        final ThreadPoolExecutor b2 = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<Runnable>(), (ThreadFactory)new umm());
        b2.allowCoreThreadTimeOut(true);
        b = b2;
        c = new Object();
        d = new l7q();
    }
    
    public static String a(final dlb dlb, final int n) {
        final StringBuilder sb = new StringBuilder();
        sb.append(dlb.e);
        sb.append("-");
        sb.append(n);
        return sb.toString();
    }
    
    public static a b(final String s, final Context context, final dlb dlb, final int n) {
        final Typeface typeface = (Typeface)jlb.a.c((Object)s);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            final slb a = clb.a(context, dlb);
            final int a2 = a.a;
            final int n2 = 1;
            int n3 = 0;
            Label_0147: {
                Label_0124: {
                    if (a2 != 0) {
                        if (a2 == 1) {
                            n3 = -2;
                            break Label_0147;
                        }
                    }
                    else {
                        final tlb[] b = a.b;
                        n3 = n2;
                        if (b == null) {
                            break Label_0147;
                        }
                        if (b.length == 0) {
                            n3 = n2;
                            break Label_0147;
                        }
                        final int length = b.length;
                        int i = 0;
                        while (i < length) {
                            final int e = b[i].e;
                            if (e != 0) {
                                if (e < 0) {
                                    break Label_0124;
                                }
                                n3 = e;
                                break Label_0147;
                            }
                            else {
                                ++i;
                            }
                        }
                        n3 = 0;
                        break Label_0147;
                    }
                }
                n3 = -3;
            }
            if (n3 != 0) {
                return new a(n3);
            }
            final Typeface b2 = ilv.a.b(context, a.b, n);
            if (b2 != null) {
                jlb.a.d((Object)s, (Object)b2);
                return new a(b2);
            }
            return new a(-3);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            return new a(-1);
        }
    }
    
    public static final class a
    {
        public final Typeface a;
        public final int b;
        
        public a(final int b) {
            this.a = null;
            this.b = b;
        }
        
        @SuppressLint({ "WrongConstant" })
        public a(final Typeface a) {
            this.a = a;
            this.b = 0;
        }
    }
}

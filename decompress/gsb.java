import java.util.List;
import com.twitter.util.user.UserIdentifier;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsb
{
    public final seg<Long, Integer> a;
    public final ncg<ArrayList<a>> b;
    
    public gsb() {
        this.a = (seg<Long, Integer>)new seg(250);
        this.b = (ncg<ArrayList<a>>)new ncg();
    }
    
    public static gsb c(final UserIdentifier userIdentifier) {
        return ((isb)zew.a().e(userIdentifier, (Class)isb.class)).G2();
    }
    
    public final boolean a(final long n) {
        synchronized (this) {
            return this.a.c((Object)n) != null;
        }
    }
    
    public final void b(final long n, int size) {
        final List list = (List)this.b.e(n);
        if (list != null) {
            size = list.size();
            while (--size >= 0) {
                ((a)list.get(size)).a();
            }
        }
    }
    
    public final void d(final long n, final int n2) {
        synchronized (this) {
            this.a.d((Object)n, (Object)n2);
            this.b(n, n2);
        }
    }
    
    public final void e(final long n, int y0) {
        synchronized (this) {
            final Integer n2 = (Integer)this.a.c((Object)n);
            int intValue;
            if (n2 == null) {
                intValue = 0;
            }
            else {
                intValue = n2;
            }
            y0 = tdy.Y0(intValue, y0);
            this.a.d((Object)n, (Object)y0);
            this.b(n, y0);
        }
    }
    
    public interface a
    {
        void a();
    }
}

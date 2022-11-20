import com.twitter.android.broadcast.di.view.a;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i4f implements ypa
{
    public final int a;
    public final Object b;
    
    public i4f(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final Object o) {
        switch (this.a) {
            default: {
                final qsb qsb = (qsb)this.b;
                czd.f((Object)qsb, "$tmp0");
                return qsb.invoke(o);
            }
            case 2: {
                return new pk3((ryt)csv.b, (pk3$a)o, (rfm)this.b);
            }
            case 1: {
                final o9k o9k = (o9k)this.b;
                final af6 af6 = (af6)o;
                return new hqe((dmv)new hw0((d32)new b32(o9k, af6.a, af6.b, af6.e, af6.c), owo.c(), gmw.H()), af6.d);
            }
            case 0: {
                final mg3 mg3 = (mg3)this.b;
                final ViewGroup viewGroup = (ViewGroup)o;
                czd.f((Object)mg3, "$captionManager");
                czd.f((Object)viewGroup, "viewGroup");
                return new w7f((i8f)viewGroup, (en2)new a(), mg3);
            }
        }
    }
}

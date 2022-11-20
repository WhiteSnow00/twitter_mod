import kotlin.NoWhenBranchMatchedException;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class wz7 implements jbx
{
    public final boolean a;
    public final String b;
    
    public wz7(final boolean a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final wz7 l(final boolean b, final String s) {
        czd.f((Object)s, "activeQuery");
        Object o;
        if (this instanceof wz7.wz7$b) {
            final u18 e = ((wz7.wz7$b)this).e;
            czd.f((Object)e, "tabType");
            o = new wz7.wz7$b(b, s, e);
        }
        else if (this instanceof wz7$c$b) {
            final wz7$c$b wz7$c$b = (wz7$c$b)this;
            o = new wz7$c$b(b, s);
        }
        else if (this instanceof wz7$c$a) {
            final wz7$c$a wz7$c$a = (wz7$c$a)this;
            o = new wz7$c$a(b, s);
        }
        else if (this instanceof wz7.wz7$a) {
            o = wz7.wz7$a.o((wz7.wz7$a)this, b, s, (List)null, 12);
        }
        else {
            if (!(this instanceof wz7$c$c)) {
                throw new NoWhenBranchMatchedException();
            }
            final wz7$c$c wz7$c$c = (wz7$c$c)this;
            o = new wz7$c$c(b, s);
        }
        return (wz7)o;
    }
    
    public String m() {
        return this.b;
    }
    
    public boolean n() {
        return this.a;
    }
}

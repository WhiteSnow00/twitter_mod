import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yw extends wqp
{
    public z6d f;
    public List<? extends cej> g;
    public Integer h;
    public ssv i;
    
    public yw(final yw.yw$b yw$b) {
        czd.f((Object)yw$b, "builder");
        super((wqp$a)yw$b);
        this.f = yw$b.e;
        final List f = yw$b.f;
        if (f != null) {
            this.g = f;
            this.h = yw$b.g;
            this.i = yw$b.h;
            return;
        }
        czd.m("buttonLabels");
        throw null;
    }
}

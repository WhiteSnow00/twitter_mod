import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ykd extends ste implements qsb<z19, y19>
{
    public final vkd D0;
    public final vkd.a<Object, Object> E0;
    
    public ykd(final vkd d0, final vkd.a<Object, Object> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$DisposableEffect");
        final vkd d0 = this.D0;
        final vkd.a<Object, Object> e0 = this.E0;
        Objects.requireNonNull(d0);
        czd.f((Object)e0, "animation");
        d0.a.b((Object)e0);
        d0.b.setValue((Object)Boolean.TRUE);
        return new xkd(this.D0, (vkd.a)this.E0);
    }
}

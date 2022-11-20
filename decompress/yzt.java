import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzt extends ste implements qsb<z19, y19>
{
    public final mzt<Object> D0;
    public final mzt<Object> E0;
    
    public yzt(final mzt<Object> d0, final mzt<Object> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "$this$DisposableEffect");
        final mzt<Object> d0 = this.D0;
        final mzt<Object> e0 = this.E0;
        Objects.requireNonNull((mzt)d0);
        czd.f((Object)e0, "transition");
        d0.i.add((Object)e0);
        return new xzt((mzt)this.D0, (mzt)this.E0);
    }
}

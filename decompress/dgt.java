import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dgt extends gue implements rtb<igt, oyv>
{
    public final /* synthetic */ uft C0;
    
    public dgt(final uft c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final igt igt = (igt)o;
        zzd.f((Object)igt, "$this$distinct");
        final uft c0 = this.C0;
        c0.F0 = (TextView)c0.C0.findViewById(2131432088);
        final uft c2 = this.C0;
        final TextView f0 = c2.F0;
        if (f0 != null) {
            c2.D0.a(f0, (xwm)igt.e);
        }
        return oyv.a;
    }
}

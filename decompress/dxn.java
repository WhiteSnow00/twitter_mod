// 
// Decompiled by Procyon v0.6.0
// 

public final class dxn extends gue implements rtb<gxn, oyv>
{
    public final /* synthetic */ bxn C0;
    
    public dxn(final bxn c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final gxn gxn = (gxn)o;
        zzd.f((Object)gxn, "$this$distinct");
        final int ordinal = ((Enum)gxn.b).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    this.C0.F0.setText(2131956947);
                }
            }
            else {
                this.C0.F0.setText(2131956950);
            }
        }
        else {
            this.C0.F0.setText(2131956946);
        }
        return oyv.a;
    }
}

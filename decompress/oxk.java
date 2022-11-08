// 
// Decompiled by Procyon v0.6.0
// 

public final class oxk extends gue implements rtb<sc2, oyv>
{
    public final /* synthetic */ txk C0;
    
    public oxk(final txk c0) {
        this.C0 = c0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final sc2 sc2 = (sc2)o;
        zzd.f((Object)sc2, "$this$distinctType");
        if (!(sc2 instanceof sc2.d)) {
            ((zp1)this.C0.C0).N0.clear();
            this.C0.C0.setValue(0.0f);
            this.C0.C0.setEnabled(false);
        }
        else {
            this.C0.C0.setEnabled(true);
            final txk c0 = this.C0;
            ((zp1)c0.C0).N0.add(new nxk(c0));
        }
        return oyv.a;
    }
}

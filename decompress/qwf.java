// 
// Decompiled by Procyon v0.6.0
// 

public final class qwf extends fo1<mvf>
{
    public final swf E0;
    
    public qwf(final swf e0) {
        this.E0 = e0;
    }
    
    public final void onNext(final Object o) {
        final mvf mvf = (mvf)o;
        final swf e0 = this.E0;
        final cof a = mvf.a;
        jee.l((Object)a);
        e0.j = a;
        final swf e2 = this.E0;
        final cof j = e2.j;
        final vwf e3 = j.e;
        e2.a.e(j.a, e3);
        if (e3 != null && e3.b()) {
            this.E0.i.T();
            this.E0.i.V0(e3.a());
        }
        else {
            this.E0.i.x();
        }
    }
}

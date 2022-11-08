// 
// Decompiled by Procyon v0.6.0
// 

public final class oyk implements gft<t94>
{
    public final rv1<t94> a;
    public final b5j<t94> b;
    
    public oyk() {
        final rv1 rv1 = new rv1();
        this.a = (rv1<t94>)rv1;
        this.b = rv1;
    }
    
    @Override
    public final boolean b(final Object o) {
        final t94 t94 = (t94)o;
        zzd.f((Object)t94, "item");
        return zzd.a((Object)t94, this.a.f());
    }
    
    @Override
    public final void c(final Object o, final boolean b) {
        final t94 t94 = (t94)o;
        zzd.f((Object)t94, "item");
        if (b) {
            this.a.onNext((Object)t94);
        }
    }
}

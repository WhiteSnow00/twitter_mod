// 
// Decompiled by Procyon v0.6.0
// 

public final class pdf extends um1
{
    public final obi<?> b;
    
    public pdf(final obi<?> b) {
        czd.f((Object)b, "navigator");
        this.b = b;
    }
    
    public final void e(final i4h i4h) {
        czd.f((Object)i4h, "mentionEntity");
        final obi<?> b = this.b;
        final k7l$a k7l$a = new k7l$a();
        k7l$a.c = i4h.J0;
        b.d((ym)((n4j)k7l$a).e());
    }
    
    public final void f(final om3 om3) {
        czd.f((Object)om3, "cashtagEntity");
        this.b.d((ym)o6a.a(om3));
    }
    
    public final void h(final qfc qfc) {
        czd.f((Object)qfc, "hashtagEntity");
        this.b.d((ym)o6a.b(qfc));
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8v
{
    public static final b Companion;
    public static final c e;
    public final String a;
    public final String b;
    public final Boolean c;
    public final Boolean d;
    
    static {
        Companion = new b();
        e = new c();
    }
    
    public a8v(final String a, final String b, final Boolean c, final Boolean d) {
        zzd.f((Object)b, "noteId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final tfe tfe) {
        tfe.r0();
        final String a = this.a;
        if (a != null) {
            tfe.u0("author_id", a);
        }
        tfe.u0("note_id", this.b);
        final Boolean c = this.c;
        if (c != null) {
            tfe.e("is_note_author_follows_viewer", c);
        }
        final Boolean d = this.d;
        if (d != null) {
            tfe.e("is_viewer_follows_note_author", d);
        }
        tfe.h();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a8v)) {
            return false;
        }
        final a8v a8v = (a8v)o;
        return zzd.a((Object)this.a, (Object)a8v.a) && zzd.a((Object)this.b, (Object)a8v.b) && zzd.a((Object)this.c, (Object)a8v.c) && zzd.a((Object)this.d, (Object)a8v.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final int a2 = l7k.a(this.b, hashCode2 * 31, 31);
        final Boolean c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return (a2 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final Boolean c = this.c;
        final Boolean d = this.d;
        final StringBuilder y = mb0.y("TwitterArticlesScribeDetails(authorId=", a, ", noteId=", b, ", isAuthorFollowsViewer=");
        y.append(c);
        y.append(", isViewerFollowsAuthor=");
        y.append(d);
        y.append(")");
        return y.toString();
    }
    
    public static final class a extends h4j<a8v>
    {
        public String a;
        public String b;
        public Boolean c;
        public Boolean d;
        
        public a() {
            this.b = "";
        }
        
        public final Object i() {
            return new a8v(this.a, this.b, this.c, this.d);
        }
        
        public final a o(final String b) {
            zzd.f((Object)b, "noteId");
            this.b = b;
            return this;
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends js2<a8v, a>
    {
        public c() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) {
            final a8v a8v = (a8v)o;
            zzd.f((Object)flp, "output");
            zzd.f((Object)a8v, "scribeDetails");
            flp.G(a8v.a);
            flp.G(a8v.b);
            final Boolean c = a8v.c;
            final hx6$h a = hx6.a;
            ((bow)a).c(flp, (Object)c);
            final int a2 = w4j.a;
            ((bow)a).c(flp, (Object)a8v.d);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) {
            final a a = (a)h4j;
            zzd.f((Object)elp, "input");
            zzd.f((Object)a, "builder");
            final String i = elp.I();
            if (i != null) {
                a.a = i;
            }
            final String c = elp.C();
            zzd.e((Object)c, "input.readNotNullString()");
            a.b = c;
            final hx6$h a2 = hx6.a;
            final Boolean b = (Boolean)((bow)a2).a(elp);
            if (b != null) {
                a.c = b;
            }
            final Boolean b2 = (Boolean)((bow)a2).a(elp);
            if (b2 != null) {
                a.d = b2;
            }
        }
    }
}

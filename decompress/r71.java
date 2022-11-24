import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r71
{
    public static final r71 a;
    
    static {
        a = new r71();
    }
    
    public final void a(final u4a<?> u4a) {
        final c a = c.a;
        final wee wee = (wee)u4a;
        wee.a(o17.class, a);
        wee.a(z91.class, a);
        final i a2 = i.a;
        wee.a(o17$e.class, a2);
        wee.a(fa1.class, a2);
        final f a3 = f.a;
        wee.a(o17$e$a.class, a3);
        wee.a(ga1.class, a3);
        final g a4 = g.a;
        wee.a(o17$e$a$a.class, a4);
        wee.a(ha1.class, a4);
        final u a5 = u.a;
        wee.a(o17$e$f.class, a5);
        wee.a(ua1.class, a5);
        final t a6 = t.a;
        wee.a(o17$e$e.class, a6);
        wee.a(ta1.class, a6);
        final h a7 = h.a;
        wee.a(o17$e$c.class, a7);
        wee.a(ia1.class, a7);
        final r a8 = r.a;
        wee.a(o17$e$d.class, a8);
        wee.a(ja1.class, a8);
        final j a9 = j.a;
        wee.a(o17$e$d$a.class, a9);
        wee.a(ka1.class, a9);
        final l a10 = l.a;
        wee.a(o17$e$d$a$b.class, a10);
        wee.a(la1.class, a10);
        final o a11 = o.a;
        wee.a(o17$e$d$a$b$d.class, a11);
        wee.a(pa1.class, a11);
        final p a12 = p.a;
        wee.a(o17$e$d$a$b$d$b.class, a12);
        wee.a(qa1.class, a12);
        final m a13 = m.a;
        wee.a(o17$e$d$a$b$b.class, a13);
        wee.a(na1.class, a13);
        final a a14 = r71.a.a;
        wee.a(o17$a.class, a14);
        wee.a(ba1.class, a14);
        final n a15 = n.a;
        wee.a(o17$e$d$a$b$c.class, a15);
        wee.a(oa1.class, a15);
        final k a16 = k.a;
        wee.a(o17$e$d$a$b$a.class, a16);
        wee.a(ma1.class, a16);
        final b a17 = b.a;
        wee.a(o17$c.class, a17);
        wee.a(ca1.class, a17);
        final q a18 = q.a;
        wee.a(o17$e$d$c.class, a18);
        wee.a(ra1.class, a18);
        final s a19 = s.a;
        wee.a(o17$e$d$d.class, a19);
        wee.a(sa1.class, a19);
        final d a20 = d.a;
        wee.a(o17$d.class, a20);
        wee.a(da1.class, a20);
        final e a21 = e.a;
        wee.a(o17$d$a.class, a21);
        wee.a(ea1.class, a21);
    }
    
    public static final class a implements b5j<o17$a>
    {
        public static final a a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        public static final lxa h;
        public static final lxa i;
        
        static {
            a = new a();
            b = lxa.b("pid");
            c = lxa.b("processName");
            d = lxa.b("reasonCode");
            e = lxa.b("importance");
            f = lxa.b("pss");
            g = lxa.b("rss");
            h = lxa.b("timestamp");
            i = lxa.b("traceFile");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$a o17$a = (o17$a)o;
            final c5j c5j = (c5j)o2;
            c5j.e(r71.a.b, o17$a.b());
            c5j.a(r71.a.c, o17$a.c());
            c5j.e(r71.a.d, o17$a.e());
            c5j.e(r71.a.e, o17$a.a());
            c5j.f(r71.a.f, o17$a.d());
            c5j.f(r71.a.g, o17$a.f());
            c5j.f(r71.a.h, o17$a.g());
            c5j.a(r71.a.i, o17$a.h());
        }
    }
    
    public static final class b implements b5j<o17$c>
    {
        public static final b a;
        public static final lxa b;
        public static final lxa c;
        
        static {
            a = new b();
            b = lxa.b("key");
            c = lxa.b("value");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$c o17$c = (o17$c)o;
            final c5j c5j = (c5j)o2;
            c5j.a(r71.b.b, o17$c.a());
            c5j.a(r71.b.c, o17$c.b());
        }
    }
    
    public static final class c implements b5j<o17>
    {
        public static final c a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        public static final lxa h;
        public static final lxa i;
        
        static {
            a = new c();
            b = lxa.b("sdkVersion");
            c = lxa.b("gmpAppId");
            d = lxa.b("platform");
            e = lxa.b("installationUuid");
            f = lxa.b("buildVersion");
            g = lxa.b("displayVersion");
            h = lxa.b("session");
            i = lxa.b("ndkPayload");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17 o3 = (o17)o;
            final c5j c5j = (c5j)o2;
            c5j.a(r71.c.b, o3.g());
            c5j.a(r71.c.c, o3.c());
            c5j.e(r71.c.d, o3.f());
            c5j.a(r71.c.e, o3.d());
            c5j.a(r71.c.f, o3.a());
            c5j.a(r71.c.g, o3.b());
            c5j.a(r71.c.h, o3.h());
            c5j.a(r71.c.i, o3.e());
        }
    }
    
    public static final class d implements b5j<o17$d>
    {
        public static final d a;
        public static final lxa b;
        public static final lxa c;
        
        static {
            a = new d();
            b = lxa.b("files");
            c = lxa.b("orgId");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$d o17$d = (o17$d)o;
            final c5j c5j = (c5j)o2;
            c5j.a(d.b, o17$d.a());
            c5j.a(d.c, o17$d.b());
        }
    }
    
    public static final class e implements b5j<o17$d$a>
    {
        public static final e a;
        public static final lxa b;
        public static final lxa c;
        
        static {
            a = new e();
            b = lxa.b("filename");
            c = lxa.b("contents");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$d$a o17$d$a = (o17$d$a)o;
            final c5j c5j = (c5j)o2;
            c5j.a(e.b, o17$d$a.b());
            c5j.a(e.c, o17$d$a.a());
        }
    }
    
    public static final class f implements b5j<o17$e$a>
    {
        public static final f a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        public static final lxa h;
        
        static {
            a = new f();
            b = lxa.b("identifier");
            c = lxa.b("version");
            d = lxa.b("displayVersion");
            e = lxa.b("organization");
            f = lxa.b("installationUuid");
            g = lxa.b("developmentPlatform");
            h = lxa.b("developmentPlatformVersion");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$a o17$e$a = (o17$e$a)o;
            final c5j c5j = (c5j)o2;
            c5j.a(r71.f.b, o17$e$a.d());
            c5j.a(r71.f.c, o17$e$a.g());
            c5j.a(r71.f.d, o17$e$a.c());
            c5j.a(r71.f.e, o17$e$a.f());
            c5j.a(r71.f.f, o17$e$a.e());
            c5j.a(r71.f.g, o17$e$a.a());
            c5j.a(r71.f.h, o17$e$a.b());
        }
    }
    
    public static final class g implements b5j<o17$e$a$a>
    {
        public static final g a;
        public static final lxa b;
        
        static {
            a = new g();
            b = lxa.b("clsId");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$a$a o17$e$a$a = (o17$e$a$a)o;
            final c5j c5j = (c5j)o2;
            final lxa b = g.b;
            o17$e$a$a.a();
            c5j.a(b, null);
        }
    }
    
    public static final class h implements b5j<o17$e$c>
    {
        public static final h a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        public static final lxa h;
        public static final lxa i;
        public static final lxa j;
        
        static {
            a = new h();
            b = lxa.b("arch");
            c = lxa.b("model");
            d = lxa.b("cores");
            e = lxa.b("ram");
            f = lxa.b("diskSpace");
            g = lxa.b("simulator");
            h = lxa.b("state");
            i = lxa.b("manufacturer");
            j = lxa.b("modelClass");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$c o17$e$c = (o17$e$c)o;
            final c5j c5j = (c5j)o2;
            c5j.e(r71.h.b, o17$e$c.a());
            c5j.a(r71.h.c, o17$e$c.e());
            c5j.e(r71.h.d, o17$e$c.b());
            c5j.f(r71.h.e, o17$e$c.g());
            c5j.f(r71.h.f, o17$e$c.c());
            c5j.d(r71.h.g, o17$e$c.i());
            c5j.e(r71.h.h, o17$e$c.h());
            c5j.a(r71.h.i, o17$e$c.d());
            c5j.a(r71.h.j, o17$e$c.f());
        }
    }
    
    public static final class i implements b5j<o17$e>
    {
        public static final i a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        public static final lxa h;
        public static final lxa i;
        public static final lxa j;
        public static final lxa k;
        public static final lxa l;
        
        static {
            a = new i();
            b = lxa.b("generator");
            c = lxa.b("identifier");
            d = lxa.b("startedAt");
            e = lxa.b("endedAt");
            f = lxa.b("crashed");
            g = lxa.b("app");
            h = lxa.b("user");
            i = lxa.b("os");
            j = lxa.b("device");
            k = lxa.b("events");
            l = lxa.b("generatorType");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e o17$e = (o17$e)o;
            final c5j c5j = (c5j)o2;
            c5j.a(r71.i.b, o17$e.e());
            c5j.a(r71.i.c, o17$e.g().getBytes(o17.a));
            c5j.f(r71.i.d, o17$e.i());
            c5j.a(r71.i.e, o17$e.c());
            c5j.d(r71.i.f, o17$e.k());
            c5j.a(r71.i.g, o17$e.a());
            c5j.a(r71.i.h, o17$e.j());
            c5j.a(r71.i.i, o17$e.h());
            c5j.a(r71.i.j, o17$e.b());
            c5j.a(r71.i.k, o17$e.d());
            c5j.e(r71.i.l, o17$e.f());
        }
    }
    
    public static final class j implements b5j<o17$e$d$a>
    {
        public static final j a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        
        static {
            a = new j();
            b = lxa.b("execution");
            c = lxa.b("customAttributes");
            d = lxa.b("internalKeys");
            e = lxa.b("background");
            f = lxa.b("uiOrientation");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a o17$e$d$a = (o17$e$d$a)o;
            final c5j c5j = (c5j)o2;
            c5j.a(j.b, o17$e$d$a.c());
            c5j.a(j.c, o17$e$d$a.b());
            c5j.a(j.d, o17$e$d$a.d());
            c5j.a(j.e, o17$e$d$a.a());
            c5j.e(j.f, o17$e$d$a.e());
        }
    }
    
    public static final class k implements b5j<o17$e$d$a$b$a>
    {
        public static final k a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        
        static {
            a = new k();
            b = lxa.b("baseAddress");
            c = lxa.b("size");
            d = lxa.b("name");
            e = lxa.b("uuid");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b$a o17$e$d$a$b$a = (o17$e$d$a$b$a)o;
            final c5j c5j = (c5j)o2;
            c5j.f(k.b, o17$e$d$a$b$a.a());
            c5j.f(k.c, o17$e$d$a$b$a.c());
            c5j.a(k.d, o17$e$d$a$b$a.b());
            final lxa e = k.e;
            final String d = o17$e$d$a$b$a.d();
            byte[] bytes;
            if (d != null) {
                bytes = d.getBytes(o17.a);
            }
            else {
                bytes = null;
            }
            c5j.a(e, bytes);
        }
    }
    
    public static final class l implements b5j<o17$e$d$a$b>
    {
        public static final l a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        
        static {
            a = new l();
            b = lxa.b("threads");
            c = lxa.b("exception");
            d = lxa.b("appExitInfo");
            e = lxa.b("signal");
            f = lxa.b("binaries");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b o17$e$d$a$b = (o17$e$d$a$b)o;
            final c5j c5j = (c5j)o2;
            c5j.a(l.b, o17$e$d$a$b.e());
            c5j.a(l.c, o17$e$d$a$b.c());
            c5j.a(l.d, o17$e$d$a$b.a());
            c5j.a(l.e, o17$e$d$a$b.d());
            c5j.a(l.f, o17$e$d$a$b.b());
        }
    }
    
    public static final class m implements b5j<o17$e$d$a$b$b>
    {
        public static final m a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        
        static {
            a = new m();
            b = lxa.b("type");
            c = lxa.b("reason");
            d = lxa.b("frames");
            e = lxa.b("causedBy");
            f = lxa.b("overflowCount");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b$b o17$e$d$a$b$b = (o17$e$d$a$b$b)o;
            final c5j c5j = (c5j)o2;
            c5j.a(m.b, o17$e$d$a$b$b.e());
            c5j.a(m.c, o17$e$d$a$b$b.d());
            c5j.a(m.d, o17$e$d$a$b$b.b());
            c5j.a(m.e, o17$e$d$a$b$b.a());
            c5j.e(m.f, o17$e$d$a$b$b.c());
        }
    }
    
    public static final class n implements b5j<o17$e$d$a$b$c>
    {
        public static final n a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        
        static {
            a = new n();
            b = lxa.b("name");
            c = lxa.b("code");
            d = lxa.b("address");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b$c o17$e$d$a$b$c = (o17$e$d$a$b$c)o;
            final c5j c5j = (c5j)o2;
            c5j.a(n.b, o17$e$d$a$b$c.c());
            c5j.a(n.c, o17$e$d$a$b$c.b());
            c5j.f(n.d, o17$e$d$a$b$c.a());
        }
    }
    
    public static final class o implements b5j<o17$e$d$a$b$d>
    {
        public static final o a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        
        static {
            a = new o();
            b = lxa.b("name");
            c = lxa.b("importance");
            d = lxa.b("frames");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b$d o17$e$d$a$b$d = (o17$e$d$a$b$d)o;
            final c5j c5j = (c5j)o2;
            c5j.a(r71.o.b, o17$e$d$a$b$d.c());
            c5j.e(r71.o.c, o17$e$d$a$b$d.b());
            c5j.a(r71.o.d, o17$e$d$a$b$d.a());
        }
    }
    
    public static final class p implements b5j<o17$e$d$a$b$d$b>
    {
        public static final p a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        
        static {
            a = new p();
            b = lxa.b("pc");
            c = lxa.b("symbol");
            d = lxa.b("file");
            e = lxa.b("offset");
            f = lxa.b("importance");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$a$b$d$b o17$e$d$a$b$d$b = (o17$e$d$a$b$d$b)o;
            final c5j c5j = (c5j)o2;
            c5j.f(p.b, o17$e$d$a$b$d$b.d());
            c5j.a(p.c, o17$e$d$a$b$d$b.e());
            c5j.a(p.d, o17$e$d$a$b$d$b.a());
            c5j.f(p.e, o17$e$d$a$b$d$b.c());
            c5j.e(p.f, o17$e$d$a$b$d$b.b());
        }
    }
    
    public static final class q implements b5j<o17$e$d$c>
    {
        public static final q a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        public static final lxa g;
        
        static {
            a = new q();
            b = lxa.b("batteryLevel");
            c = lxa.b("batteryVelocity");
            d = lxa.b("proximityOn");
            e = lxa.b("orientation");
            f = lxa.b("ramUsed");
            g = lxa.b("diskUsed");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d$c o17$e$d$c = (o17$e$d$c)o;
            final c5j c5j = (c5j)o2;
            c5j.a(q.b, o17$e$d$c.a());
            c5j.e(q.c, o17$e$d$c.b());
            c5j.d(q.d, o17$e$d$c.f());
            c5j.e(q.e, o17$e$d$c.d());
            c5j.f(q.f, o17$e$d$c.e());
            c5j.f(q.g, o17$e$d$c.c());
        }
    }
    
    public static final class r implements b5j<o17$e$d>
    {
        public static final r a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        public static final lxa f;
        
        static {
            a = new r();
            b = lxa.b("timestamp");
            c = lxa.b("type");
            d = lxa.b("app");
            e = lxa.b("device");
            f = lxa.b("log");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$d o17$e$d = (o17$e$d)o;
            final c5j c5j = (c5j)o2;
            c5j.f(r.b, o17$e$d.d());
            c5j.a(r.c, o17$e$d.e());
            c5j.a(r.d, o17$e$d.a());
            c5j.a(r.e, o17$e$d.b());
            c5j.a(r.f, o17$e$d.c());
        }
    }
    
    public static final class s implements b5j<o17$e$d$d>
    {
        public static final s a;
        public static final lxa b;
        
        static {
            a = new s();
            b = lxa.b("content");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            ((c5j)o2).a(s.b, ((o17$e$d$d)o).a());
        }
    }
    
    public static final class t implements b5j<o17$e$e>
    {
        public static final t a;
        public static final lxa b;
        public static final lxa c;
        public static final lxa d;
        public static final lxa e;
        
        static {
            a = new t();
            b = lxa.b("platform");
            c = lxa.b("version");
            d = lxa.b("buildVersion");
            e = lxa.b("jailbroken");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            final o17$e$e o17$e$e = (o17$e$e)o;
            final c5j c5j = (c5j)o2;
            c5j.e(t.b, o17$e$e.b());
            c5j.a(t.c, o17$e$e.c());
            c5j.a(t.d, o17$e$e.a());
            c5j.d(t.e, o17$e$e.d());
        }
    }
    
    public static final class u implements b5j<o17$e$f>
    {
        public static final u a;
        public static final lxa b;
        
        static {
            a = new u();
            b = lxa.b("identifier");
        }
        
        public final void a(final Object o, final Object o2) throws IOException {
            ((c5j)o2).a(u.b, ((o17$e$f)o).a());
        }
    }
}

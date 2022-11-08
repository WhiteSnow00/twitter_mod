// 
// Decompiled by Procyon v0.6.0
// 

public abstract class khi
{
    public static final class a extends khi
    {
        public final String a;
        
        public a(final String a) {
            zzd.f((Object)a, "profileUrl");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("NavigateToProfile(profileUrl=", this.a, ")");
        }
    }
    
    public static final class b extends khi
    {
        public final String a;
        public final hfv b;
        
        public b(final String a, final hfv b) {
            zzd.f((Object)a, "revueAccountId");
            zzd.f((Object)b, "currentProfile");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hfv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScribeStartReadingButtonClick(revueAccountId=");
            sb.append(a);
            sb.append(", currentProfile=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends khi
    {
        public final String a;
        public final hfv b;
        
        public c(final String a, final hfv b) {
            zzd.f((Object)a, "revueAccountId");
            zzd.f((Object)b, "currentProfile");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hfv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScribeStartReadingButtonImpression(revueAccountId=");
            sb.append(a);
            sb.append(", currentProfile=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d extends khi
    {
        public final String a;
        public final hfv b;
        
        public d(final String a, final hfv b) {
            zzd.f((Object)a, "revueAccountId");
            zzd.f((Object)b, "currentProfile");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hfv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScribeSubscribeButtonClick(revueAccountId=");
            sb.append(a);
            sb.append(", currentProfile=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e extends khi
    {
        public final String a;
        public final hfv b;
        
        public e(final String a, final hfv b) {
            zzd.f((Object)a, "revueAccountId");
            zzd.f((Object)b, "currentProfile");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return zzd.a((Object)this.a, (Object)e.a) && zzd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hfv b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("ScribeSubscribeButtonImpression(revueAccountId=");
            sb.append(a);
            sb.append(", currentProfile=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f extends khi
    {
        public final String a;
        public final String b;
        public final hfv c;
        public final String d;
        public final oii e;
        public final jev f;
        
        public f(final String a, final String b, final hfv c, final String d, final oii e, final jev f) {
            zzd.f((Object)a, "title");
            zzd.f((Object)b, "profileUrl");
            zzd.f((Object)c, "currentProfileOwner");
            zzd.f((Object)d, "revueAccountId");
            zzd.f((Object)e, "newsletterSource");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof f)) {
                return false;
            }
            final f f = (f)o;
            return zzd.a((Object)this.a, (Object)f.a) && zzd.a((Object)this.b, (Object)f.b) && zzd.a((Object)this.c, (Object)f.c) && zzd.a((Object)this.d, (Object)f.d) && this.e == f.e && zzd.a((Object)this.f, (Object)f.f);
        }
        
        @Override
        public final int hashCode() {
            final int a = l7k.a(this.d, nb0.g(this.c, l7k.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
            final int hashCode = this.e.hashCode();
            final jev f = this.f;
            int hashCode2;
            if (f == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = f.hashCode();
            }
            return (hashCode + a) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final hfv c = this.c;
            final String d = this.d;
            final oii e = this.e;
            final jev f = this.f;
            final StringBuilder y = mb0.y("ShowEmailNeededSheet(title=", a, ", profileUrl=", b, ", currentProfileOwner=");
            y.append(c);
            y.append(", revueAccountId=");
            y.append(d);
            y.append(", newsletterSource=");
            y.append(e);
            y.append(", twitterScribeAssociation=");
            y.append(f);
            y.append(")");
            return y.toString();
        }
    }
    
    public static final class g extends khi
    {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final hfv h;
        public final oii i;
        public final jev j;
        
        public g(final String a, final String b, final String c, final String d, final String e, final String f, final String g, final hfv h, final oii i, final jev j) {
            zzd.f((Object)a, "title");
            zzd.f((Object)c, "tosUrl");
            zzd.f((Object)d, "privacyPolicyUrl");
            zzd.f((Object)e, "email");
            zzd.f((Object)f, "profileUrl");
            zzd.f((Object)g, "accountId");
            zzd.f((Object)h, "currentProfileOwner");
            zzd.f((Object)i, "newsletterSource");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof g)) {
                return false;
            }
            final g g = (g)o;
            return zzd.a((Object)this.a, (Object)g.a) && zzd.a((Object)this.b, (Object)g.b) && zzd.a((Object)this.c, (Object)g.c) && zzd.a((Object)this.d, (Object)g.d) && zzd.a((Object)this.e, (Object)g.e) && zzd.a((Object)this.f, (Object)g.f) && zzd.a((Object)this.g, (Object)g.g) && zzd.a((Object)this.h, (Object)g.h) && this.i == g.i && zzd.a((Object)this.j, (Object)g.j);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            final int n = 0;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            final int g = nb0.g(this.h, l7k.a(this.g, l7k.a(this.f, l7k.a(this.e, l7k.a(this.d, l7k.a(this.c, (hashCode * 31 + hashCode2) * 31, 31), 31), 31), 31), 31), 31);
            final int hashCode3 = this.i.hashCode();
            final jev j = this.j;
            int hashCode4;
            if (j == null) {
                hashCode4 = n;
            }
            else {
                hashCode4 = j.hashCode();
            }
            return (hashCode3 + g) * 31 + hashCode4;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final String c = this.c;
            final String d = this.d;
            final String e = this.e;
            final String f = this.f;
            final String g = this.g;
            final hfv h = this.h;
            final oii i = this.i;
            final jev j = this.j;
            final StringBuilder y = mb0.y("ShowSubscribeSheet(title=", a, ", sampleIssueUrl=", b, ", tosUrl=");
            mag.m(y, c, ", privacyPolicyUrl=", d, ", email=");
            mag.m(y, e, ", profileUrl=", f, ", accountId=");
            y.append(g);
            y.append(", currentProfileOwner=");
            y.append(h);
            y.append(", newsletterSource=");
            y.append(i);
            y.append(", twitterScribeAssociation=");
            y.append(j);
            y.append(")");
            return y.toString();
        }
    }
}

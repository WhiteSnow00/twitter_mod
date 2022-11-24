import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class twv
{
    public final tj3 a;
    public final jl3 b;
    public final a c;
    public final g d;
    public final b e;
    
    public twv(final tj3 a, final jl3 b, final a c, final g d, final b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof twv)) {
            return false;
        }
        final twv twv = (twv)o;
        return this.a == twv.a && this.b == twv.b && e0e.a((Object)this.c, (Object)twv.c) && e0e.a((Object)this.d, (Object)twv.d) && e0e.a((Object)this.e, (Object)twv.e);
    }
    
    @Override
    public final int hashCode() {
        final tj3 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final jl3 b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final a c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final g d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final b e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final tj3 a = this.a;
        final jl3 b = this.b;
        final a c = this.c;
        final g d = this.d;
        final b e = this.e;
        final StringBuilder sb = new StringBuilder();
        sb.append("UnifiedCard(card_fetch_state=");
        sb.append(a);
        sb.append(", card_type=");
        sb.append(b);
        sb.append(", display_options=");
        sb.append(c);
        sb.append(", layout=");
        sb.append(d);
        sb.append(", experiment_signals=");
        sb.append(e);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final Boolean a;
        public final Boolean b;
        
        public a(final Boolean a, final Boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final Boolean a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Boolean b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final Boolean a = this.a;
            final Boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Display_options(hide_border=");
            sb.append(a);
            sb.append(", hide_bottom_padding=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final Boolean a;
        public final Boolean b;
        
        public b(final Boolean a, final Boolean b) {
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
            return e0e.a((Object)this.a, (Object)b.a) && e0e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            final Boolean a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Boolean b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final Boolean a = this.a;
            final Boolean b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Experiment_signals(is_fallback_browser=");
            sb.append(a);
            sb.append(", expandable_media=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final euw b;
        
        public c(final String a, final euw b) {
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
            return e0e.a((Object)this.a, (Object)c.a) && e0e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final euw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("First_slide1(__typename=");
            sb.append(a);
            sb.append(", verticalStackLayout=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final euw b;
        
        public d(final String a, final euw b) {
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
            return e0e.a((Object)this.a, (Object)d.a) && e0e.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final euw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("First_slide(__typename=");
            sb.append(a);
            sb.append(", verticalStackLayout=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final euw b;
        
        public e(final String a, final euw b) {
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
            return e0e.a((Object)this.a, (Object)e.a) && e0e.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final euw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Full_slide1(__typename=");
            sb.append(a);
            sb.append(", verticalStackLayout=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class f
    {
        public final String a;
        public final euw b;
        
        public f(final String a, final euw b) {
            this.a = a;
            this.b = b;
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
            return e0e.a((Object)this.a, (Object)f.a) && e0e.a((Object)this.b, (Object)f.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final euw b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Full_slide(__typename=");
            sb.append(a);
            sb.append(", verticalStackLayout=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class g
    {
        public final String a;
        public final i b;
        public final h c;
        public final euw d;
        public final nqc e;
        
        public g(final String a, final i b, final h c, final euw d, final nqc e) {
            e0e.f((Object)a, "__typename");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
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
            return e0e.a((Object)this.a, (Object)g.a) && e0e.a((Object)this.b, (Object)g.b) && e0e.a((Object)this.c, (Object)g.c) && e0e.a((Object)this.d, (Object)g.d) && e0e.a((Object)this.e, (Object)g.e);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final i b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final h c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final euw d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final nqc e = this.e;
            if (e != null) {
                hashCode2 = e.hashCode();
            }
            return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final i b = this.b;
            final h c = this.c;
            final euw d = this.d;
            final nqc e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("Layout(__typename=");
            sb.append(a);
            sb.append(", onCardSwipeableLayout=");
            sb.append(b);
            sb.append(", onCardCollectionLayout=");
            sb.append(c);
            sb.append(", verticalStackLayout=");
            sb.append(d);
            sb.append(", horizontalCompactLayout=");
            sb.append(e);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h
    {
        public final c a;
        public final List<e> b;
        
        public h(final c a, final List<e> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof h)) {
                return false;
            }
            final h h = (h)o;
            return e0e.a((Object)this.a, (Object)h.a) && e0e.a((Object)this.b, (Object)h.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final List<e> b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final c a = this.a;
            final List<e> b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardCollectionLayout(first_slide=");
            sb.append(a);
            sb.append(", full_slides=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class i
    {
        public final d a;
        public final List<f> b;
        
        public i(final d a, final List<f> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return e0e.a((Object)this.a, (Object)i.a) && e0e.a((Object)this.b, (Object)i.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final List<f> b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final d a = this.a;
            final List<f> b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnCardSwipeableLayout(first_slide=");
            sb.append(a);
            sb.append(", full_slides=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}

import java.util.Collection;
import android.content.res.Resources;
import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import android.text.SpannableStringBuilder;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdk
{
    public final CharSequence a;
    public final Set<String> b;
    public final Map<String, CharSequence> c;
    public SpannableStringBuilder d;
    public d e;
    public char f;
    public int g;
    
    public hdk(final CharSequence a) {
        this.b = new HashSet();
        this.c = new HashMap();
        char char1;
        if (a.length() > 0) {
            char1 = a.charAt(0);
        }
        else {
            char1 = '\0';
        }
        this.f = char1;
        this.a = a;
        Object o = null;
        while (true) {
            final char f = this.f;
            Object e;
            if (f == '\0') {
                e = null;
            }
            else if (f == '{') {
                char char2;
                if (this.g < this.a.length() - 1) {
                    char2 = this.a.charAt(this.g + 1);
                }
                else {
                    char2 = '\0';
                }
                if (char2 == '{') {
                    this.a();
                    this.a();
                    e = new hdk.hdk$b((d)o);
                }
                else {
                    if (char2 < 'a' || char2 > 'z') {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected first character '");
                        sb.append(char2);
                        sb.append("'; must be lower case a-z.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    this.a();
                    char f2;
                    while (true) {
                        f2 = this.f;
                        if ((f2 < 'a' || f2 > 'z') && f2 != '_') {
                            break;
                        }
                        sb2.append(f2);
                        this.a();
                    }
                    if (f2 != '}') {
                        final StringBuilder f3 = ehk.f("Unexpected character '");
                        f3.append(this.f);
                        f3.append("'; expecting lower case a-z, '_', or '}'");
                        throw new IllegalArgumentException(f3.toString());
                    }
                    this.a();
                    if (sb2.length() == 0) {
                        throw new IllegalArgumentException("Empty key: {}");
                    }
                    final String string = sb2.toString();
                    this.b.add(string);
                    e = new hdk.hdk$a((d)o, string);
                }
            }
            else {
                final int g = this.g;
                while (true) {
                    final char f4 = this.f;
                    if (f4 == '{' || f4 == '\0') {
                        break;
                    }
                    this.a();
                }
                e = new hdk.hdk$c((d)o, this.g - g);
            }
            if (e == null) {
                return;
            }
            o = e;
            if (this.e != null) {
                continue;
            }
            this.e = (d)e;
            o = e;
        }
    }
    
    public static hdk c(final Context context, final int n) {
        return d(context.getResources(), n);
    }
    
    public static hdk d(final Resources resources, final int n) {
        return new hdk(resources.getText(n));
    }
    
    public final void a() {
        final int g = this.g + 1;
        this.g = g;
        char char1;
        if (g == this.a.length()) {
            char1 = '\0';
        }
        else {
            char1 = this.a.charAt(this.g);
        }
        this.f = char1;
    }
    
    public final CharSequence b() {
        if (this.d == null) {
            if (!this.c.keySet().containsAll(this.b)) {
                final HashSet set = new HashSet(this.b);
                set.removeAll(this.c.keySet());
                final StringBuilder sb = new StringBuilder();
                sb.append("Missing keys: ");
                sb.append(set);
                throw new IllegalArgumentException(sb.toString());
            }
            final SpannableStringBuilder d = new SpannableStringBuilder(this.a);
            for (d d2 = this.e; d2 != null; d2 = d2.b) {
                d2.a(d, this.c);
            }
            this.d = d;
        }
        return (CharSequence)this.d;
    }
    
    public final hdk e(final String s, final CharSequence charSequence) {
        if (!this.b.contains(s)) {
            throw new IllegalArgumentException(mqb.l("Invalid key: ", s));
        }
        if (charSequence != null) {
            this.c.put(s, charSequence);
            this.d = null;
            return this;
        }
        throw new IllegalArgumentException(c0e.h("Null value for '", s, "'"));
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
    
    public abstract static class d
    {
        public final d a;
        public d b;
        
        public d(final d a) {
            this.a = a;
            if (a != null) {
                a.b = this;
            }
        }
        
        public abstract void a(final SpannableStringBuilder p0, final Map<String, CharSequence> p1);
        
        public abstract int b();
        
        public final int c() {
            final d a = this.a;
            if (a == null) {
                return 0;
            }
            return this.a.b() + a.c();
        }
    }
}

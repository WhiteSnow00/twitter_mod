import java.util.Locale;
import java.text.BreakIterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ig extends cg
{
    public static final ig.ig$a Companion;
    public static ig d;
    public BreakIterator c;
    
    static {
        Companion = new ig.ig$a();
    }
    
    public ig(final Locale locale) {
        final BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        zzd.e((Object)wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }
    
    public final int[] a(int n) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (n >= this.d().length()) {
            return null;
        }
        int n2;
        if ((n2 = n) < 0) {
            n2 = 0;
        }
        while (!this.g(n2)) {
            final boolean g = this.g(n2);
            final int n3 = 1;
            Label_0079: {
                if (g) {
                    n = n3;
                    if (n2 == 0) {
                        break Label_0079;
                    }
                    if (!this.g(n2 - 1)) {
                        n = n3;
                        break Label_0079;
                    }
                }
                n = 0;
            }
            if (n != 0) {
                break;
            }
            final BreakIterator c = this.c;
            if (c == null) {
                zzd.m("impl");
                throw null;
            }
            n = c.following(n2);
            if ((n2 = n) == -1) {
                return null;
            }
        }
        final BreakIterator c2 = this.c;
        if (c2 == null) {
            zzd.m("impl");
            throw null;
        }
        n = c2.following(n2);
        if (n != -1 && this.f(n)) {
            return this.c(n2, n);
        }
        return null;
    }
    
    public final int[] b(int preceding) {
        final int length = this.d().length();
        if (length <= 0) {
            return null;
        }
        if (preceding <= 0) {
            return null;
        }
        int n;
        if ((n = preceding) > length) {
            n = length;
        }
        while (n > 0 && !this.g(n - 1) && !this.f(n)) {
            final BreakIterator c = this.c;
            if (c == null) {
                zzd.m("impl");
                throw null;
            }
            preceding = c.preceding(n);
            if ((n = preceding) == -1) {
                return null;
            }
        }
        final BreakIterator c2 = this.c;
        if (c2 != null) {
            final int preceding2 = c2.preceding(n);
            if (preceding2 != -1) {
                if (this.g(preceding2) && (preceding2 == 0 || !this.g(preceding2 - 1))) {
                    preceding = 1;
                }
                else {
                    preceding = 0;
                }
                if (preceding != 0) {
                    return this.c(preceding2, n);
                }
            }
            return null;
        }
        zzd.m("impl");
        throw null;
    }
    
    @Override
    public final void e(final String s) {
        zzd.f((Object)s, "text");
        super.a = s;
        final BreakIterator c = this.c;
        if (c != null) {
            c.setText(s);
            return;
        }
        zzd.m("impl");
        throw null;
    }
    
    public final boolean f(final int n) {
        return n > 0 && this.g(n - 1) && (n == this.d().length() || !this.g(n));
    }
    
    public final boolean g(final int n) {
        return n >= 0 && n < this.d().length() && Character.isLetterOrDigit(this.d().codePointAt(n));
    }
}

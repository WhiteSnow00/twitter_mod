import android.graphics.Paint;
import android.text.TextUtils;
import android.text.PrecomputedText$Params$Builder;
import android.text.PrecomputedText$Params;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.os.Build$VERSION;
import android.text.Spannable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtk implements Spannable
{
    public final char charAt(final int n) {
        throw null;
    }
    
    public final int getSpanEnd(final Object o) {
        throw null;
    }
    
    public final int getSpanFlags(final Object o) {
        throw null;
    }
    
    public final int getSpanStart(final Object o) {
        throw null;
    }
    
    public final <T> T[] getSpans(final int n, final int n2, final Class<T> clazz) {
        if (Build$VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }
    
    public final int length() {
        throw null;
    }
    
    public final int nextSpanTransition(final int n, final int n2, final Class clazz) {
        throw null;
    }
    
    public final void removeSpan(final Object o) {
        if (o instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build$VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }
    
    public final void setSpan(final Object o, final int n, final int n2, final int n3) {
        if (o instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build$VERSION.SDK_INT >= 29) {
            throw null;
        }
        throw null;
    }
    
    public final CharSequence subSequence(final int n, final int n2) {
        throw null;
    }
    
    @Override
    public final String toString() {
        throw null;
    }
    
    public static final class a
    {
        public final TextPaint a;
        public final TextDirectionHeuristic b;
        public final int c;
        public final int d;
        
        public a(final PrecomputedText$Params precomputedText$Params) {
            this.a = precomputedText$Params.getTextPaint();
            this.b = precomputedText$Params.getTextDirection();
            this.c = precomputedText$Params.getBreakStrategy();
            this.d = precomputedText$Params.getHyphenationFrequency();
        }
        
        public a(final TextPaint a, final TextDirectionHeuristic textDirectionHeuristic, final int n, final int n2) {
            if (Build$VERSION.SDK_INT >= 29) {
                new PrecomputedText$Params$Builder(a).setBreakStrategy(n).setHyphenationFrequency(n2).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = a;
            this.b = textDirectionHeuristic;
            this.c = n;
            this.d = n2;
        }
        
        public final boolean a(final a a) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 23) {
                if (this.c != a.c) {
                    return false;
                }
                if (this.d != a.d) {
                    return false;
                }
            }
            if (((Paint)this.a).getTextSize() != ((Paint)a.a).getTextSize()) {
                return false;
            }
            if (((Paint)this.a).getTextScaleX() != ((Paint)a.a).getTextScaleX()) {
                return false;
            }
            if (((Paint)this.a).getTextSkewX() != ((Paint)a.a).getTextSkewX()) {
                return false;
            }
            if (((Paint)this.a).getLetterSpacing() != ((Paint)a.a).getLetterSpacing()) {
                return false;
            }
            if (!TextUtils.equals((CharSequence)((Paint)this.a).getFontFeatureSettings(), (CharSequence)((Paint)a.a).getFontFeatureSettings())) {
                return false;
            }
            if (((Paint)this.a).getFlags() != ((Paint)a.a).getFlags()) {
                return false;
            }
            if (sdk_INT >= 24) {
                if (!this.a.getTextLocales().equals((Object)a.a.getTextLocales())) {
                    return false;
                }
            }
            else if (!((Paint)this.a).getTextLocale().equals(((Paint)a.a).getTextLocale())) {
                return false;
            }
            if (((Paint)this.a).getTypeface() == null) {
                if (((Paint)a.a).getTypeface() != null) {
                    return false;
                }
            }
            else if (!((Paint)this.a).getTypeface().equals((Object)((Paint)a.a).getTypeface())) {
                return false;
            }
            return true;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a(a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            if (Build$VERSION.SDK_INT >= 24) {
                return a5j.b(new Object[] { ((Paint)this.a).getTextSize(), ((Paint)this.a).getTextScaleX(), ((Paint)this.a).getTextSkewX(), ((Paint)this.a).getLetterSpacing(), ((Paint)this.a).getFlags(), this.a.getTextLocales(), ((Paint)this.a).getTypeface(), ((Paint)this.a).isElegantTextHeight(), this.b, this.c, this.d });
            }
            return a5j.b(new Object[] { ((Paint)this.a).getTextSize(), ((Paint)this.a).getTextScaleX(), ((Paint)this.a).getTextSkewX(), ((Paint)this.a).getLetterSpacing(), ((Paint)this.a).getFlags(), ((Paint)this.a).getTextLocale(), ((Paint)this.a).getTypeface(), ((Paint)this.a).isElegantTextHeight(), this.b, this.c, this.d });
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("{");
            final StringBuilder g = w48.g("textSize=");
            g.append(((Paint)this.a).getTextSize());
            sb.append(g.toString());
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", textScaleX=");
            sb2.append(((Paint)this.a).getTextScaleX());
            sb.append(sb2.toString());
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(", textSkewX=");
            sb3.append(((Paint)this.a).getTextSkewX());
            sb.append(sb3.toString());
            final int sdk_INT = Build$VERSION.SDK_INT;
            final StringBuilder g2 = w48.g(", letterSpacing=");
            g2.append(((Paint)this.a).getLetterSpacing());
            sb.append(g2.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(", elegantTextHeight=");
            sb4.append(((Paint)this.a).isElegantTextHeight());
            sb.append(sb4.toString());
            if (sdk_INT >= 24) {
                final StringBuilder g3 = w48.g(", textLocale=");
                g3.append(this.a.getTextLocales());
                sb.append(g3.toString());
            }
            else {
                final StringBuilder g4 = w48.g(", textLocale=");
                g4.append(((Paint)this.a).getTextLocale());
                sb.append(g4.toString());
            }
            final StringBuilder g5 = w48.g(", typeface=");
            g5.append(((Paint)this.a).getTypeface());
            sb.append(g5.toString());
            if (sdk_INT >= 26) {
                final StringBuilder g6 = w48.g(", variationSettings=");
                g6.append(this.a.getFontVariationSettings());
                sb.append(g6.toString());
            }
            final StringBuilder g7 = w48.g(", textDir=");
            g7.append(this.b);
            sb.append(g7.toString());
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(", breakStrategy=");
            sb5.append(this.c);
            sb.append(sb5.toString());
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(", hyphenationFrequency=");
            sb6.append(this.d);
            sb.append(sb6.toString());
            sb.append("}");
            return sb.toString();
        }
    }
}

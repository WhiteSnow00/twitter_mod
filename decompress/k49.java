import android.text.style.DynamicDrawableSpan;
import android.text.Spanned;
import android.text.TextWatcher;
import android.graphics.Rect;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import com.google.android.material.chip.a;
import java.util.Objects;
import android.content.Context;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.text.Editable;
import java.util.List;
import android.widget.EditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k49
{
    public static final b Companion;
    public EditText a;
    public final uv1<sks> b;
    public final uv1<a> c;
    public List<kpn> d;
    public final d e;
    
    static {
        Companion = new b();
    }
    
    public k49() {
        this.b = (uv1<sks>)new uv1();
        this.c = (uv1<a>)new uv1();
        this.d = (List<kpn>)h3a.F0;
        this.e = new d();
    }
    
    public final List<c> a() {
        final EditText a = this.a;
        if (a != null) {
            final Editable text = a.getText();
            e0e.e((Object)text, "editText.text");
            final Object[] spans = ((Spanned)text).getSpans(0, ((CharSequence)text).length(), (Class)c.class);
            e0e.e((Object)spans, "getSpans(start, end, T::class.java)");
            return ft0.p1(spans);
        }
        e0e.m("editText");
        throw null;
    }
    
    public final int b() {
        return this.a().size();
    }
    
    public final Editable c() {
        final EditText a = this.a;
        if (a != null) {
            final Editable text = a.getText();
            e0e.e((Object)text, "it");
            final boolean b = ((CharSequence)text).length() == 0;
            CharSequence subSequence = (CharSequence)text;
            if (!b) {
                if (this.b() == 0) {
                    subSequence = (CharSequence)text;
                }
                else {
                    subSequence = ((CharSequence)text).subSequence(this.b(), ((CharSequence)text).length());
                }
            }
            return (Editable)new SpannableStringBuilder(subSequence);
        }
        e0e.m("editText");
        throw null;
    }
    
    public static final class a
    {
        public final kpn a;
        
        public a(final kpn a) {
            e0e.f((Object)a, "invite");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final kpn a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ChipDeletedEvent(invite=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c extends ImageSpan
    {
        private static final a Companion;
        public final kpn F0;
        
        static {
            Companion = new a();
        }
        
        public c(final Context context, final kpn f0) {
            e0e.f((Object)f0, "invite");
            Objects.requireNonNull(c.Companion);
            final int[] n2 = com.google.android.material.chip.a.n2;
            final AttributeSet a = le9.a(context, 2132213783, (CharSequence)"chip");
            int styleAttribute;
            if ((styleAttribute = a.getStyleAttribute()) == 0) {
                styleAttribute = 2132019355;
            }
            final com.google.android.material.chip.a i = com.google.android.material.chip.a.I(context, a, 2130968898, styleAttribute);
            i.p0((CharSequence)f0.b);
            ((Drawable)i).setBounds(0, 0, i.getIntrinsicWidth(), (int)i.g1);
            super((Drawable)i);
            this.F0 = f0;
        }
        
        public final void draw(final Canvas canvas, final CharSequence charSequence, int descent, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
            e0e.f((Object)canvas, "canvas");
            e0e.f((Object)paint, "paint");
            final Drawable drawable = ((DynamicDrawableSpan)this).getDrawable();
            canvas.save();
            final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            e0e.e((Object)fontMetricsInt, "paint.fontMetricsInt");
            descent = fontMetricsInt.descent;
            canvas.translate(n2, (float)(n4 + descent - (descent - fontMetricsInt.ascent) / 2 - (drawable.getBounds().bottom - drawable.getBounds().top) / 2));
            drawable.draw(canvas);
            canvas.restore();
        }
        
        public final int getSize(final Paint paint, final CharSequence charSequence, int descent, int bottom, final Paint$FontMetricsInt paint$FontMetricsInt) {
            e0e.f((Object)paint, "paint");
            final Rect bounds = ((DynamicDrawableSpan)this).getDrawable().getBounds();
            e0e.e((Object)bounds, "drawable.bounds");
            if (paint$FontMetricsInt != null) {
                final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                e0e.e((Object)fontMetricsInt, "paint.fontMetricsInt");
                descent = fontMetricsInt.descent;
                final int ascent = fontMetricsInt.ascent;
                bottom = bounds.bottom;
                final int top = bounds.top;
                descent = (descent - ascent) / 2 + ascent;
                bottom = (bottom - top) / 2;
                final int n = descent - bottom;
                paint$FontMetricsInt.ascent = n;
                paint$FontMetricsInt.top = n;
                descent += bottom;
                paint$FontMetricsInt.bottom = descent;
                paint$FontMetricsInt.descent = descent;
            }
            return bounds.right;
        }
        
        public static final class a
        {
        }
    }
    
    public final class d implements TextWatcher
    {
        public boolean F0;
        public boolean G0;
        public int H0;
        public final k49 I0;
        
        public d(final k49 i0) {
            this.I0 = i0;
        }
        
        public final void afterTextChanged(final Editable editable) {
            final k49$d$a k49$d$a = new k49$d$a(this, this.I0);
            if (this.F0) {
                this.F0 = false;
            }
            else {
                k49$d$a.invoke();
            }
        }
        
        public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            final k49$d$b k49$d$b = new k49$d$b(this, this.I0, charSequence, n);
            if (!this.F0) {
                k49$d$b.invoke();
            }
        }
        
        public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            final k49$d$c k49$d$c = new k49$d$c(n, this);
            if (!this.F0) {
                k49$d$c.invoke();
            }
        }
    }
}

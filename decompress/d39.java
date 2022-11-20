import android.text.style.DynamicDrawableSpan;
import android.text.Spanned;
import java.util.Iterator;
import android.widget.TextView;
import java.util.Collection;
import java.util.ArrayList;
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

public final class d39
{
    public static final b Companion;
    public EditText a;
    public final mv1<aks> b;
    public final mv1<d39$a> c;
    public List<ton> d;
    public final d e;
    
    static {
        Companion = new b();
    }
    
    public d39() {
        this.b = (mv1<aks>)new mv1();
        this.c = (mv1<d39$a>)new mv1();
        this.d = (List<ton>)f2a.D0;
        this.e = new d();
    }
    
    public final List<c> a() {
        final EditText a = this.a;
        if (a != null) {
            final Editable text = a.getText();
            czd.e((Object)text, "editText.text");
            final Object[] spans = ((Spanned)text).getSpans(0, ((CharSequence)text).length(), (Class)c.class);
            czd.e((Object)spans, "getSpans(start, end, T::class.java)");
            return ct0.g1(spans);
        }
        czd.m("editText");
        throw null;
    }
    
    public final int b() {
        return this.a().size();
    }
    
    public final Editable c() {
        final EditText a = this.a;
        if (a != null) {
            final Editable text = a.getText();
            czd.e((Object)text, "it");
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
        czd.m("editText");
        throw null;
    }
    
    public static final class b
    {
    }
    
    public static final class c extends ImageSpan
    {
        private static final a Companion;
        public final ton D0;
        
        static {
            Companion = new a();
        }
        
        public c(final Context context, final ton d0) {
            czd.f((Object)d0, "invite");
            Objects.requireNonNull(c.Companion);
            final int[] l2 = com.google.android.material.chip.a.l2;
            final AttributeSet a = id9.a(context, 2132213783, (CharSequence)"chip");
            int styleAttribute;
            if ((styleAttribute = a.getStyleAttribute()) == 0) {
                styleAttribute = 2132019355;
            }
            final com.google.android.material.chip.a i = com.google.android.material.chip.a.I(context, a, 2130968898, styleAttribute);
            i.p0((CharSequence)d0.b);
            ((Drawable)i).setBounds(0, 0, i.getIntrinsicWidth(), (int)i.e1);
            super((Drawable)i);
            this.D0 = d0;
        }
        
        public final void draw(final Canvas canvas, final CharSequence charSequence, int descent, final int n, final float n2, final int n3, final int n4, final int n5, final Paint paint) {
            czd.f((Object)canvas, "canvas");
            czd.f((Object)paint, "paint");
            final Drawable drawable = ((DynamicDrawableSpan)this).getDrawable();
            canvas.save();
            final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            czd.e((Object)fontMetricsInt, "paint.fontMetricsInt");
            descent = fontMetricsInt.descent;
            canvas.translate(n2, (float)(n4 + descent - (descent - fontMetricsInt.ascent) / 2 - (drawable.getBounds().bottom - drawable.getBounds().top) / 2));
            drawable.draw(canvas);
            canvas.restore();
        }
        
        public final int getSize(final Paint paint, final CharSequence charSequence, int bottom, int top, final Paint$FontMetricsInt paint$FontMetricsInt) {
            czd.f((Object)paint, "paint");
            final Rect bounds = ((DynamicDrawableSpan)this).getDrawable().getBounds();
            czd.e((Object)bounds, "drawable.bounds");
            if (paint$FontMetricsInt != null) {
                final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                czd.e((Object)fontMetricsInt, "paint.fontMetricsInt");
                final int descent = fontMetricsInt.descent;
                final int ascent = fontMetricsInt.ascent;
                bottom = bounds.bottom;
                top = bounds.top;
                final int n = (descent - ascent) / 2 + ascent;
                top = (bottom - top) / 2;
                bottom = n - top;
                paint$FontMetricsInt.ascent = bottom;
                paint$FontMetricsInt.top = bottom;
                bottom = n + top;
                paint$FontMetricsInt.bottom = bottom;
                paint$FontMetricsInt.descent = bottom;
            }
            return bounds.right;
        }
        
        public static final class a
        {
        }
    }
    
    public final class d implements TextWatcher
    {
        public boolean D0;
        public boolean E0;
        public int F0;
        public final d39 G0;
        
        public d(final d39 g0) {
            this.G0 = g0;
        }
        
        public final void afterTextChanged(final Editable editable) {
            final nsb<fzv> nsb = (nsb<fzv>)new nsb<fzv>(this, this.G0) {
                public final d D0;
                public final d39 E0;
                
                public final Object invoke() {
                    final d d0 = this.D0;
                    if (d0.E0) {
                        d0.E0 = false;
                        final d39 e0 = this.E0;
                        final List<ton> d2 = e0.d;
                        final ArrayList list = new ArrayList();
                        for (final ton next : d2) {
                            final ton ton = next;
                            final List<c> a = e0.a();
                            boolean b = false;
                            Label_0137: {
                                if (!a.isEmpty()) {
                                    final Iterator iterator2 = a.iterator();
                                    while (iterator2.hasNext()) {
                                        if (czd.a((Object)((c)iterator2.next()).D0, (Object)ton)) {
                                            b = true;
                                            break Label_0137;
                                        }
                                    }
                                }
                                b = false;
                            }
                            if (!b) {
                                list.add(next);
                            }
                        }
                        final d39 e2 = this.E0;
                        final Iterator iterator3 = list.iterator();
                        while (iterator3.hasNext()) {
                            e2.c.onNext((Object)new d39$a((ton)iterator3.next()));
                        }
                        final d39 e3 = this.E0;
                        final List p0 = mq4.P0((Collection)e3.d);
                        ((ArrayList)p0).removeAll(list);
                        e3.d = p0;
                    }
                    final d39 e4 = this.E0;
                    final mv1<aks> b2 = e4.b;
                    final EditText a2 = e4.a;
                    if (a2 != null) {
                        b2.onNext((Object)new aks((TextView)a2, e4.c()));
                        return fzv.a;
                    }
                    czd.m("editText");
                    throw null;
                }
            };
            if (this.D0) {
                this.D0 = false;
            }
            else {
                nsb.invoke();
            }
        }
        
        public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            final nsb<fzv> nsb = (nsb<fzv>)new nsb<fzv>(this, this.G0, charSequence, n) {
                public final d D0;
                public final d39 E0;
                
                public final Object invoke() {
                    this.D0.F0 = this.E0.b();
                    Objects.requireNonNull(this.D0);
                    Objects.requireNonNull(this.D0);
                    return fzv.a;
                }
            };
            if (!this.D0) {
                nsb.invoke();
            }
        }
        
        public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            final nsb<fzv> nsb = (nsb<fzv>)new nsb<fzv>(n, this) {
                public final int D0;
                public final d E0;
                
                public final Object invoke() {
                    final int d0 = this.D0;
                    final d e0 = this.E0;
                    if (d0 < e0.F0) {
                        e0.E0 = true;
                    }
                    return fzv.a;
                }
            };
            if (!this.D0) {
                nsb.invoke();
            }
        }
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.fleets.page.thread.compose.overlay;

import android.widget.ImageView;
import android.text.Layout;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;
import java.util.Iterator;
import java.util.List;
import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Region;
import android.text.TextPaint;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import kotlin.NoWhenBranchMatchedException;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.widget.TextView;
import java.util.Objects;
import android.graphics.Paint;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.text.Editable$Factory;
import android.graphics.RectF;
import android.graphics.Path;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lcom/twitter/app/fleets/page/thread/compose/overlay/FleetOverlayContainer;", "Landroid/widget/FrameLayout;", "", "value", "C0", "Z", "getShouldFadeOutOfBoundsOverlays", "()Z", "setShouldFadeOutOfBoundsOverlays", "(Z)V", "shouldFadeOutOfBoundsOverlays", "Landroid/graphics/Paint;", "outOfBoundsAlphaPaint$delegate", "Lgxe;", "getOutOfBoundsAlphaPaint", "()Landroid/graphics/Paint;", "outOfBoundsAlphaPaint", "Companion", "a", "feature.tfa.fleets.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class FleetOverlayContainer extends FrameLayout
{
    public static final a Companion;
    public boolean C0;
    public View D0;
    public final int E0;
    public final u3s F0;
    
    static {
        Companion = new a();
    }
    
    public FleetOverlayContainer(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        this.C0 = true;
        this.E0 = context.getResources().getDimensionPixelOffset(2131167432);
        new Path();
        new RectF();
        this.F0 = (u3s)rp2.z0((otb)r3b.C0);
        if (((View)this).isInEditMode()) {
            final b4b b4b = new b4b(context);
            b4b.setFleetText(Editable$Factory.getInstance().newEditable((CharSequence)"Hello Fleets\nWhat is happening?"));
            b4b.setTextSize(0, 100.0f);
            ((View)b4b).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 17));
            b4b.setTextColor(-16777216);
            ((View)b4b).setLayerType(1, (Paint)null);
            final z5b textHelper = b4b.getTextHelper();
            Objects.requireNonNull(textHelper);
            textHelper.e = 1;
            final kis b = textHelper.b;
            b.M0.setColor(0);
            b.M0.setAntiAlias(true);
            final TextView a = textHelper.a;
            a.setTextColor(eo6.b(((View)a).getContext(), bl0.b(textHelper.e)));
            final TextView a2 = textHelper.a;
            a2.setHighlightColor(eo6.b(((View)a2).getContext(), 2131100886));
            ((View)textHelper.a).invalidate();
            ((ViewGroup)this).addView((View)b4b);
            final u3b u3b = new u3b(context);
            ((View)u3b).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1, 17));
            ((View)u3b).setLayerType(1, (Paint)null);
            ((ViewGroup)this).addView((View)u3b);
            final knu knu = new knu(context);
            ((View)knu).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -2, 17));
            ((View)knu).setLayerType(1, (Paint)null);
            ((ViewGroup)this).addView((View)knu);
        }
    }
    
    private final Paint getOutOfBoundsAlphaPaint() {
        return (Paint)this.F0.getValue();
    }
    
    public final void a(MotionEvent obtain) {
        final View d0 = this.D0;
        if (d0 != null) {
            if (obtain.getAction() == 3) {
                d0.dispatchTouchEvent(obtain);
            }
            else {
                obtain = MotionEvent.obtain(obtain);
                zzd.e((Object)obtain, "obtain(event)");
                obtain.offsetLocation((float)(((View)this).getScrollX() - d0.getLeft()), (float)(((View)this).getScrollY() - d0.getTop()));
                final Matrix matrix = new Matrix();
                d0.getMatrix().invert(matrix);
                obtain.transform(matrix);
                d0.dispatchTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        zzd.f((Object)canvas, "canvas");
        final p0b$a p0b$a = new p0b$a((p0b)tjp.G0(y6x.b((ViewGroup)this), (rtb)FleetOverlayContainer$b.C0));
        while (p0b$a.hasNext()) {
            final View view = (View)p0b$a.next();
            if (view instanceof b4b) {
                final b4b b4b = (b4b)view;
                Objects.requireNonNull(b4b.getTextHelper());
                final TextPaint paint = b4b.getPaint();
                final float textSize = ((Paint)paint).getTextSize();
                final int color = ((Paint)paint).getColor();
                final int alpha = ((Paint)paint).getAlpha();
                final Rect rect = new Rect();
                ((Paint)paint).setColor(b4b.getTextColors().getDefaultColor());
                ((Paint)paint).setTextSize(((View)b4b).getScaleY() * textSize);
                ((Paint)paint).setAlpha((int)(((View)b4b).getAlpha() * 255));
                ((View)b4b).getHitRect(rect);
                final int n = canvas.getHeight() / 2;
                final int n2 = canvas.getWidth() / 2;
                final float n3 = ((View)b4b).getScaleX() * ((View)b4b).getWidth();
                final float n4 = (float)((View)b4b).getHeight();
                final float scaleY = ((View)b4b).getScaleY();
                final float n5 = (float)((View)b4b).getPaddingTop();
                final float scaleY2 = ((View)b4b).getScaleY();
                final float n6 = (float)n;
                final float n7 = scaleY * n4 / 2.0f;
                final int d = nb0.D(b4b.getTextHelper().f);
                Layout$Alignment layout$Alignment;
                if (d != 0) {
                    if (d != 1) {
                        if (d != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                    }
                    else {
                        layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                    }
                }
                else {
                    layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                }
                final kis b = b4b.getTextHelper().b;
                final int alpha2 = ((Paint)paint).getAlpha();
                if (b.M0.getAlpha() != 0) {
                    b.M0.setAlpha(alpha2);
                }
                final kis b2 = b4b.getTextHelper().b;
                final float scaleX = ((View)b4b).getScaleX();
                b2.K0 = b2.D0 * scaleX;
                b2.L0 = scaleX * b2.C0;
                final kis b3 = b4b.getTextHelper().b;
                b3.G0 = -1.0f;
                b3.H0 = -1.0f;
                b3.I0 = -1.0f;
                b3.J0 = -1.0f;
                final float n8 = (float)(rect.centerX() - n2);
                final float n9 = (float)(rect.centerY() - n);
                final int save = canvas.save();
                canvas.translate(n8, n9);
                try {
                    final float rotation = ((View)b4b).getRotation();
                    final float n10 = (float)n2;
                    canvas.rotate(rotation, n10, n6);
                    canvas.translate(n10 - n3 / 2.0f, n6 - n7 + scaleY2 * n5);
                    final CharSequence text = b4b.getText();
                    final int p = q0b.p(n3);
                    final float n11 = 2;
                    final float a = t4s.a;
                    try {
                        ((Layout)new StaticLayout(text, paint, p, layout$Alignment, 1.0f, n11 * a, true)).draw(canvas);
                        canvas.restoreToCount(save);
                        ((Paint)paint).setColor(color);
                        ((Paint)paint).setTextSize(textSize);
                        ((Paint)paint).setAlpha(alpha);
                    }
                    finally {}
                }
                finally {}
                canvas.restoreToCount(save);
            }
            else if (view instanceof fqj) {
                ((ViewGroup)this).drawChild(canvas, view, 0L);
            }
            view.setFocusable(true);
        }
    }
    
    public final boolean getShouldFadeOutOfBoundsOverlays() {
        return this.C0;
    }
    
    public final boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        zzd.f((Object)motionEvent, "e");
        return true;
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        zzd.f((Object)motionEvent, "e");
        final int action = motionEvent.getAction();
        final int n = 1;
        int n2 = 1;
        if (action != 0) {
            if (action != 1 && action != 3) {
                this.a(motionEvent);
            }
            else {
                this.a(motionEvent);
                this.D0 = null;
            }
            n2 = n;
        }
        else {
            Iterator iterator = ((y6x$a)y6x.b((ViewGroup)this)).iterator();
            View view = null;
            while (true) {
                final z6x z6x = (z6x)iterator;
                if (!z6x.hasNext()) {
                    break;
                }
                Object next = z6x.next();
                final View view2 = (View)next;
                final float x = motionEvent.getX();
                final float n3 = (float)(((View)this).getScrollX() - view2.getLeft());
                final float y = motionEvent.getY();
                final float n4 = (float)(((View)this).getScrollY() - view2.getTop());
                final Matrix matrix = new Matrix();
                view2.getMatrix().invert(matrix);
                final float[] array = { x + n3, 0.0f };
                array[n2] = y + n4;
                matrix.mapPoints(array);
                final float n5 = array[0];
                final float n6 = array[n2];
                final float[] array2 = new float[9];
                view2.getMatrix().getValues(array2);
                final double pow = Math.pow(array2[0], 2.0);
                final float n7 = array2[n2];
                final View view3 = view;
                final int o = q0b.o(this.E0 / Math.sqrt(Math.pow(n7, 2.0) + pow));
                View view4;
                boolean b4;
                if (view2 instanceof u3b) {
                    final v3b stickerHelper = ((u3b)view2).getStickerHelper();
                    Region b = stickerHelper.b;
                    final ie9 controller = ((me9)stickerHelper.a).getController();
                    Animatable g;
                    if (controller != null) {
                        g = controller.g();
                    }
                    else {
                        g = null;
                    }
                    final boolean b2 = g != null;
                    if (b != null && !b2) {
                        view4 = (View)next;
                    }
                    else {
                        b = new Region();
                        final Drawable drawable = ((ImageView)stickerHelper.a).getDrawable();
                        zzd.e((Object)drawable, "overlayView.drawable");
                        final Bitmap bitmap = Bitmap.createBitmap(64, 64, Bitmap$Config.ALPHA_8);
                        final Canvas canvas = new Canvas(bitmap);
                        final float min = Math.min(bitmap.getWidth() / (float)drawable.getBounds().width(), bitmap.getHeight() / (float)drawable.getBounds().height());
                        canvas.scale(min, min);
                        drawable.draw(canvas);
                        final ArrayList<PointF> list = new ArrayList<PointF>();
                        final ArrayList<PointF> list2 = new ArrayList<PointF>();
                        int n8 = 64;
                        int n9 = 0;
                        int n10 = 0;
                        z6x z6x2 = (z6x)iterator;
                        View view5;
                        z6x z6x3;
                        while (true) {
                            int n11;
                            int n16;
                            if (n9 < 64) {
                                int i = 0;
                                n11 = 64;
                                int n12 = 0;
                                while (i < 64) {
                                    final boolean b3 = Color.alpha(bitmap.getPixel(i, n9)) >= 128;
                                    int n13 = n11;
                                    int n14 = n12;
                                    if (b3) {
                                        int n15;
                                        if (i < (n15 = n11)) {
                                            n15 = i;
                                        }
                                        n14 = i + 1;
                                        n13 = n15;
                                    }
                                    ++i;
                                    n11 = n13;
                                    n12 = n14;
                                }
                                view5 = (View)next;
                                n16 = n12;
                            }
                            else {
                                view5 = (View)next;
                                n16 = 0;
                                n11 = 64;
                            }
                            z6x3 = z6x2;
                            if (n11 != 64 || n8 != 64) {
                                if (n11 != n8) {
                                    list.add(new PointF((float)Math.min(n11, n8), (float)n9));
                                }
                                if (n16 != n10) {
                                    list2.add(new PointF((float)Math.max(n16, n10), (float)n9));
                                }
                            }
                            if (n9 == 64) {
                                break;
                            }
                            ++n9;
                            z6x2 = z6x3;
                            n8 = n11;
                            next = view5;
                            n10 = n16;
                        }
                        Path path;
                        if (list.isEmpty()) {
                            path = null;
                        }
                        else {
                            path = new Path();
                            final PointF pointF = (PointF)or4.G1((List)list);
                            path.moveTo(pointF.x, pointF.y);
                            for (final PointF pointF2 : or4.B1((Iterable)list)) {
                                path.lineTo(pointF2.x, pointF2.y);
                            }
                            for (final PointF pointF3 : or4.Z1((Iterable)list2)) {
                                path.lineTo(pointF3.x, pointF3.y);
                            }
                            path.close();
                            final Matrix matrix2 = new Matrix();
                            final float n17 = 1 / min;
                            matrix2.setScale(n17, n17);
                            path.transform(matrix2);
                        }
                        n2 = 1;
                        if (path != null) {
                            final RectF rectF = new RectF();
                            path.computeBounds(rectF, true);
                            final Rect rect = new Rect();
                            rectF.roundOut(rect);
                            b.setPath(path, new Region(rect));
                        }
                        else {
                            b.set(0, 0, ((View)stickerHelper.a).getWidth(), ((View)stickerHelper.a).getHeight());
                        }
                        stickerHelper.b = b;
                        view4 = view5;
                        iterator = z6x3;
                    }
                    b4 = b.contains(q0b.p(n5), q0b.p(n6));
                }
                else {
                    Rect rect2;
                    if (view2 instanceof b4b) {
                        final b4b b4b = (b4b)view2;
                        Objects.requireNonNull(b4b.getTextHelper());
                        final int n18 = (int)((View)b4b).getResources().getDimension(2131167565);
                        rect2 = new Rect(0, 0, ((View)b4b).getWidth(), ((View)b4b).getHeight());
                        rect2.left += n18;
                        final int top = rect2.top + n18;
                        rect2.top = top;
                        rect2.right -= n18;
                        rect2.bottom -= n18;
                        final Integer c = b4b.getTextHelper().c;
                        int intValue;
                        if (c != null) {
                            intValue = c;
                        }
                        else {
                            intValue = 0;
                        }
                        rect2.top = top + intValue;
                        final int bottom = rect2.bottom;
                        final Integer d = b4b.getTextHelper().d;
                        int intValue2;
                        if (d != null) {
                            intValue2 = d;
                        }
                        else {
                            intValue2 = 0;
                        }
                        rect2.bottom = bottom + intValue2;
                    }
                    else {
                        rect2 = new Rect(0, 0, view2.getWidth(), view2.getHeight());
                    }
                    final int n19 = -o;
                    rect2.inset(n19, n19);
                    b4 = rect2.contains(q0b.p(n5), q0b.p(n6));
                    view4 = (View)next;
                }
                View view6 = view3;
                if (b4) {
                    view6 = view4;
                }
                view = view6;
            }
            ((ViewGroup)this).bringChildToFront(this.D0 = view);
            this.a(motionEvent);
        }
        ((View)this).requestLayout();
        if (this.D0 == null) {
            n2 = 0;
        }
        return n2 != 0;
    }
    
    public final void setShouldFadeOutOfBoundsOverlays(final boolean c0) {
        this.C0 = c0;
        ((View)this).invalidate();
    }
    
    public static final class a
    {
    }
}

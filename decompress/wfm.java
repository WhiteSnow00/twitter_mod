import android.graphics.Outline;
import android.graphics.Matrix;
import android.view.DisplayListCanvas;
import java.util.Objects;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.RenderNode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wfm implements fv8
{
    public static final a Companion;
    public static boolean g = true;
    public final RenderNode a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    
    static {
        Companion = new a();
    }
    
    public wfm(final AndroidComposeView androidComposeView) {
        e0e.f((Object)androidComposeView, "ownerView");
        final RenderNode create = RenderNode.create("Compose", (View)androidComposeView);
        e0e.e((Object)create, "create(\"Compose\", ownerView)");
        this.a = create;
        if (wfm.g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build$VERSION.SDK_INT >= 28) {
                final cgm a = cgm.a;
                a.c(create, a.a(create));
                a.d(create, a.b(create));
            }
            this.c();
            wfm.g = false;
        }
    }
    
    public final int A() {
        return this.b;
    }
    
    public final void B(final boolean b) {
        this.f = b;
        this.a.setClipToBounds(b);
    }
    
    public final boolean C(final int b, final int c, final int d, final int e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        return this.a.setLeftTopRightBottom(b, c, d, e);
    }
    
    public final void D() {
        this.c();
    }
    
    public final void E(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    public final void F(final int n) {
        this.c += n;
        this.e += n;
        this.a.offsetTopAndBottom(n);
    }
    
    public final boolean G() {
        return this.a.isValid();
    }
    
    public final boolean H() {
        return this.a.setHasOverlappingRendering(true);
    }
    
    public final boolean I() {
        return this.f;
    }
    
    public final int J() {
        return this.c;
    }
    
    public final void K(final dh3 dh3, final c0k c0k, final stb<? super ah3, vzv> stb) {
        e0e.f((Object)dh3, "canvasHolder");
        final DisplayListCanvas start = this.a.start(this.d - this.b, this.e - this.c);
        e0e.e((Object)start, "renderNode.start(width, height)");
        final e20 e20 = (e20)dh3.F0;
        final Canvas a = e20.a;
        final Canvas a2 = (Canvas)start;
        Objects.requireNonNull(e20);
        e20.a = a2;
        final e20 e21 = (e20)dh3.F0;
        if (c0k != null) {
            e21.p();
            ad.d((ah3)e21, c0k, 0, 2, null);
        }
        stb.invoke((Object)e21);
        if (c0k != null) {
            e21.c();
        }
        ((e20)dh3.F0).v(a);
        this.a.end(start);
    }
    
    public final boolean L() {
        return this.a.getClipToOutline();
    }
    
    public final void M(final Matrix matrix) {
        e0e.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    public final void N(final int n) {
        this.b += n;
        this.d += n;
        this.a.offsetLeftAndRight(n);
    }
    
    public final int O() {
        return this.e;
    }
    
    public final void P(final float pivotX) {
        this.a.setPivotX(pivotX);
    }
    
    public final void Q(final float pivotY) {
        this.a.setPivotY(pivotY);
    }
    
    public final void R(final Outline outline) {
        this.a.setOutline(outline);
    }
    
    public final void S(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            cgm.a.c(this.a, n);
        }
    }
    
    public final int T() {
        return this.d;
    }
    
    public final void U(final boolean clipToOutline) {
        this.a.setClipToOutline(clipToOutline);
    }
    
    public final void V(final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            cgm.a.d(this.a, n);
        }
    }
    
    public final float W() {
        return this.a.getElevation();
    }
    
    public final float a() {
        return this.a.getAlpha();
    }
    
    public final void b(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    public final void c() {
        if (Build$VERSION.SDK_INT >= 24) {
            bgm.a.a(this.a);
        }
        else {
            agm.a.a(this.a);
        }
    }
    
    public final int getHeight() {
        return this.e - this.c;
    }
    
    public final int getWidth() {
        return this.d - this.b;
    }
    
    public final void h(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    public final void l(final float scaleX) {
        this.a.setScaleX(scaleX);
    }
    
    public final void n(final float n) {
        this.a.setCameraDistance(-n);
    }
    
    public final void o(final float rotationX) {
        this.a.setRotationX(rotationX);
    }
    
    public final void p(final float rotationY) {
        this.a.setRotationY(rotationY);
    }
    
    public final void r() {
    }
    
    public final void s(final float rotation) {
        this.a.setRotation(rotation);
    }
    
    public final void t(final float scaleY) {
        this.a.setScaleY(scaleY);
    }
    
    public final void y(final float translationX) {
        this.a.setTranslationX(translationX);
    }
    
    public final void z(final Canvas canvas) {
        ((DisplayListCanvas)canvas).drawRenderNode(this.a);
    }
    
    public static final class a
    {
    }
}

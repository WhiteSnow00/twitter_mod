import android.os.Build$VERSION;
import android.graphics.Outline;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import java.util.Objects;
import androidx.compose.ui.platform.AndroidComposeView;
import android.graphics.RenderNode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sem implements pu8
{
    public final RenderNode a;
    
    public sem(final AndroidComposeView androidComposeView) {
        zzd.f((Object)androidComposeView, "ownerView");
        this.a = new RenderNode("Compose");
    }
    
    @Override
    public final int A() {
        return this.a.getLeft();
    }
    
    @Override
    public final void B(final boolean clipToBounds) {
        this.a.setClipToBounds(clipToBounds);
    }
    
    @Override
    public final boolean C(final int n, final int n2, final int n3, final int n4) {
        return this.a.setPosition(n, n2, n3, n4);
    }
    
    @Override
    public final void D() {
        this.a.discardDisplayList();
    }
    
    @Override
    public final void E(final float elevation) {
        this.a.setElevation(elevation);
    }
    
    @Override
    public final void F(final int n) {
        this.a.offsetTopAndBottom(n);
    }
    
    @Override
    public final boolean G() {
        return this.a.hasDisplayList();
    }
    
    @Override
    public final boolean H() {
        return this.a.setHasOverlappingRendering(true);
    }
    
    @Override
    public final boolean I() {
        return this.a.getClipToBounds();
    }
    
    @Override
    public final int J() {
        return this.a.getTop();
    }
    
    @Override
    public final void K(final ug3 ug3, final hzj hzj, final rtb<? super rg3, oyv> rtb) {
        zzd.f((Object)ug3, "canvasHolder");
        final RecordingCanvas beginRecording = this.a.beginRecording();
        zzd.e((Object)beginRecording, "renderNode.beginRecording()");
        final f20 f20 = (f20)ug3.C0;
        final Canvas a = f20.a;
        Objects.requireNonNull(f20);
        f20.a = (Canvas)beginRecording;
        final f20 f21 = (f20)ug3.C0;
        if (hzj != null) {
            f21.p();
            e1.g((rg3)f21, hzj, 0, 2, (Object)null);
        }
        rtb.invoke((Object)f21);
        if (hzj != null) {
            f21.c();
        }
        ((f20)ug3.C0).v(a);
        this.a.endRecording();
    }
    
    @Override
    public final boolean L() {
        return this.a.getClipToOutline();
    }
    
    @Override
    public final void M(final Matrix matrix) {
        zzd.f((Object)matrix, "matrix");
        this.a.getMatrix(matrix);
    }
    
    @Override
    public final void N(final int n) {
        this.a.offsetLeftAndRight(n);
    }
    
    @Override
    public final int O() {
        return this.a.getBottom();
    }
    
    @Override
    public final void P(final float pivotX) {
        this.a.setPivotX(pivotX);
    }
    
    @Override
    public final void Q(final float pivotY) {
        this.a.setPivotY(pivotY);
    }
    
    @Override
    public final void R(final Outline outline) {
        this.a.setOutline(outline);
    }
    
    @Override
    public final void S(final int ambientShadowColor) {
        this.a.setAmbientShadowColor(ambientShadowColor);
    }
    
    @Override
    public final int T() {
        return this.a.getRight();
    }
    
    @Override
    public final void U(final boolean clipToOutline) {
        this.a.setClipToOutline(clipToOutline);
    }
    
    @Override
    public final void V(final int spotShadowColor) {
        this.a.setSpotShadowColor(spotShadowColor);
    }
    
    @Override
    public final float W() {
        return this.a.getElevation();
    }
    
    @Override
    public final float a() {
        return this.a.getAlpha();
    }
    
    @Override
    public final void b(final float alpha) {
        this.a.setAlpha(alpha);
    }
    
    @Override
    public final int getHeight() {
        return this.a.getHeight();
    }
    
    @Override
    public final int getWidth() {
        return this.a.getWidth();
    }
    
    @Override
    public final void h(final float translationY) {
        this.a.setTranslationY(translationY);
    }
    
    @Override
    public final void l(final float scaleX) {
        this.a.setScaleX(scaleX);
    }
    
    @Override
    public final void n(final float cameraDistance) {
        this.a.setCameraDistance(cameraDistance);
    }
    
    @Override
    public final void o(final float rotationX) {
        this.a.setRotationX(rotationX);
    }
    
    @Override
    public final void p(final float rotationY) {
        this.a.setRotationY(rotationY);
    }
    
    @Override
    public final void r() {
        if (Build$VERSION.SDK_INT >= 31) {
            tem.a.a(this.a, null);
        }
    }
    
    @Override
    public final void s(final float rotationZ) {
        this.a.setRotationZ(rotationZ);
    }
    
    @Override
    public final void t(final float scaleY) {
        this.a.setScaleY(scaleY);
    }
    
    @Override
    public final void y(final float translationX) {
        this.a.setTranslationX(translationX);
    }
    
    @Override
    public final void z(final Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }
}

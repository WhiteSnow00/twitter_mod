import android.util.DisplayMetrics;
import android.graphics.ColorSpace$Named;
import android.graphics.ColorSpace;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class he0
{
    public static final yq4 a(final Bitmap bitmap) {
        czd.f((Object)bitmap, "<this>");
        final ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null) {
            final yq4 yq4 = b(colorSpace);
            if (yq4 != null) {
                return yq4;
            }
        }
        final zq4 a = zq4.a;
        return zq4.d;
    }
    
    public static final yq4 b(final ColorSpace colorSpace) {
        czd.f((Object)colorSpace, "<this>");
        Object o;
        if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.SRGB))) {
            final zq4 a = zq4.a;
            o = zq4.d;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ACES))) {
            final zq4 a2 = zq4.a;
            o = zq4.p;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ACESCG))) {
            final zq4 a3 = zq4.a;
            o = zq4.q;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ADOBE_RGB))) {
            final zq4 a4 = zq4.a;
            o = zq4.n;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.BT2020))) {
            final zq4 a5 = zq4.a;
            o = zq4.i;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.BT709))) {
            final zq4 a6 = zq4.a;
            o = zq4.h;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.CIE_LAB))) {
            final zq4 a7 = zq4.a;
            o = zq4.s;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.CIE_XYZ))) {
            final zq4 a8 = zq4.a;
            o = zq4.r;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.DCI_P3))) {
            final zq4 a9 = zq4.a;
            o = zq4.j;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.DISPLAY_P3))) {
            final zq4 a10 = zq4.a;
            o = zq4.k;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.EXTENDED_SRGB))) {
            final zq4 a11 = zq4.a;
            o = zq4.f;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.LINEAR_EXTENDED_SRGB))) {
            final zq4 a12 = zq4.a;
            o = zq4.g;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.LINEAR_SRGB))) {
            final zq4 a13 = zq4.a;
            o = zq4.e;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.NTSC_1953))) {
            final zq4 a14 = zq4.a;
            o = zq4.l;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.PRO_PHOTO_RGB))) {
            final zq4 a15 = zq4.a;
            o = zq4.o;
        }
        else if (czd.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.SMPTE_C))) {
            final zq4 a16 = zq4.a;
            o = zq4.m;
        }
        else {
            final zq4 a17 = zq4.a;
            o = zq4.d;
        }
        return (yq4)o;
    }
    
    public static final Bitmap c(final int n, final int n2, final int n3, final boolean b, final yq4 yq4) {
        czd.f((Object)yq4, "colorSpace");
        final Bitmap bitmap = Bitmap.createBitmap((DisplayMetrics)null, n, n2, psd.c(n3), b, d(yq4));
        czd.e((Object)bitmap, "createBitmap(\n          \u2026orkColorSpace()\n        )");
        return bitmap;
    }
    
    public static final ColorSpace d(final yq4 yq4) {
        czd.f((Object)yq4, "<this>");
        final zq4 a = zq4.a;
        ColorSpace$Named colorSpace$Named;
        if (czd.a((Object)yq4, (Object)zq4.d)) {
            colorSpace$Named = ColorSpace$Named.SRGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.p)) {
            colorSpace$Named = ColorSpace$Named.ACES;
        }
        else if (czd.a((Object)yq4, (Object)zq4.q)) {
            colorSpace$Named = ColorSpace$Named.ACESCG;
        }
        else if (czd.a((Object)yq4, (Object)zq4.n)) {
            colorSpace$Named = ColorSpace$Named.ADOBE_RGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.i)) {
            colorSpace$Named = ColorSpace$Named.BT2020;
        }
        else if (czd.a((Object)yq4, (Object)zq4.h)) {
            colorSpace$Named = ColorSpace$Named.BT709;
        }
        else if (czd.a((Object)yq4, (Object)zq4.s)) {
            colorSpace$Named = ColorSpace$Named.CIE_LAB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.r)) {
            colorSpace$Named = ColorSpace$Named.CIE_XYZ;
        }
        else if (czd.a((Object)yq4, (Object)zq4.j)) {
            colorSpace$Named = ColorSpace$Named.DCI_P3;
        }
        else if (czd.a((Object)yq4, (Object)zq4.k)) {
            colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
        }
        else if (czd.a((Object)yq4, (Object)zq4.f)) {
            colorSpace$Named = ColorSpace$Named.EXTENDED_SRGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.g)) {
            colorSpace$Named = ColorSpace$Named.LINEAR_EXTENDED_SRGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.e)) {
            colorSpace$Named = ColorSpace$Named.LINEAR_SRGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.l)) {
            colorSpace$Named = ColorSpace$Named.NTSC_1953;
        }
        else if (czd.a((Object)yq4, (Object)zq4.o)) {
            colorSpace$Named = ColorSpace$Named.PRO_PHOTO_RGB;
        }
        else if (czd.a((Object)yq4, (Object)zq4.m)) {
            colorSpace$Named = ColorSpace$Named.SMPTE_C;
        }
        else {
            colorSpace$Named = ColorSpace$Named.SRGB;
        }
        final ColorSpace value = ColorSpace.get(colorSpace$Named);
        czd.e((Object)value, "get(frameworkNamedSpace)");
        return value;
    }
}

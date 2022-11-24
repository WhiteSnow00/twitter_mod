import android.graphics.PorterDuff$Mode;
import java.util.Objects;
import android.graphics.BlendMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c20
{
    public static final BlendMode a(final int n) {
        final q12$a companion = q12.Companion;
        Objects.requireNonNull(companion);
        final int n2 = 0;
        BlendMode blendMode;
        if (n == 0) {
            blendMode = BlendMode.CLEAR;
        }
        else {
            Objects.requireNonNull(companion);
            if (n == 1) {
                blendMode = BlendMode.SRC;
            }
            else {
                Objects.requireNonNull(companion);
                if (n == 2) {
                    blendMode = BlendMode.DST;
                }
                else {
                    Objects.requireNonNull(companion);
                    if (n == 3) {
                        blendMode = BlendMode.SRC_OVER;
                    }
                    else {
                        Objects.requireNonNull(companion);
                        if (n == 4) {
                            blendMode = BlendMode.DST_OVER;
                        }
                        else {
                            Objects.requireNonNull(companion);
                            if (n == 5) {
                                blendMode = BlendMode.SRC_IN;
                            }
                            else {
                                Objects.requireNonNull(companion);
                                if (n == 6) {
                                    blendMode = BlendMode.DST_IN;
                                }
                                else {
                                    Objects.requireNonNull(companion);
                                    if (n == 7) {
                                        blendMode = BlendMode.SRC_OUT;
                                    }
                                    else {
                                        Objects.requireNonNull(companion);
                                        if (n == 8) {
                                            blendMode = BlendMode.DST_OUT;
                                        }
                                        else {
                                            Objects.requireNonNull(companion);
                                            if (n == 9) {
                                                blendMode = BlendMode.SRC_ATOP;
                                            }
                                            else {
                                                Objects.requireNonNull(companion);
                                                if (n == 10) {
                                                    blendMode = BlendMode.DST_ATOP;
                                                }
                                                else {
                                                    Objects.requireNonNull(companion);
                                                    if (n == 11) {
                                                        blendMode = BlendMode.XOR;
                                                    }
                                                    else {
                                                        Objects.requireNonNull(companion);
                                                        if (n == 12) {
                                                            blendMode = BlendMode.PLUS;
                                                        }
                                                        else {
                                                            Objects.requireNonNull(companion);
                                                            if (n == 13) {
                                                                blendMode = BlendMode.MODULATE;
                                                            }
                                                            else {
                                                                Objects.requireNonNull(companion);
                                                                if (n == 14) {
                                                                    blendMode = BlendMode.SCREEN;
                                                                }
                                                                else {
                                                                    Objects.requireNonNull(companion);
                                                                    if (n == 15) {
                                                                        blendMode = BlendMode.OVERLAY;
                                                                    }
                                                                    else {
                                                                        Objects.requireNonNull(companion);
                                                                        if (n == 16) {
                                                                            blendMode = BlendMode.DARKEN;
                                                                        }
                                                                        else {
                                                                            Objects.requireNonNull(companion);
                                                                            if (n == 17) {
                                                                                blendMode = BlendMode.LIGHTEN;
                                                                            }
                                                                            else {
                                                                                Objects.requireNonNull(companion);
                                                                                if (n == 18) {
                                                                                    blendMode = BlendMode.COLOR_DODGE;
                                                                                }
                                                                                else {
                                                                                    Objects.requireNonNull(companion);
                                                                                    if (n == 19) {
                                                                                        blendMode = BlendMode.COLOR_BURN;
                                                                                    }
                                                                                    else {
                                                                                        Objects.requireNonNull(companion);
                                                                                        if (n == 20) {
                                                                                            blendMode = BlendMode.HARD_LIGHT;
                                                                                        }
                                                                                        else {
                                                                                            Objects.requireNonNull(companion);
                                                                                            if (n == 21) {
                                                                                                blendMode = BlendMode.SOFT_LIGHT;
                                                                                            }
                                                                                            else {
                                                                                                Objects.requireNonNull(companion);
                                                                                                if (n == 22) {
                                                                                                    blendMode = BlendMode.DIFFERENCE;
                                                                                                }
                                                                                                else {
                                                                                                    Objects.requireNonNull(companion);
                                                                                                    if (n == 23) {
                                                                                                        blendMode = BlendMode.EXCLUSION;
                                                                                                    }
                                                                                                    else {
                                                                                                        Objects.requireNonNull(companion);
                                                                                                        if (n == 24) {
                                                                                                            blendMode = BlendMode.MULTIPLY;
                                                                                                        }
                                                                                                        else {
                                                                                                            Objects.requireNonNull(companion);
                                                                                                            if (n == 25) {
                                                                                                                blendMode = BlendMode.HUE;
                                                                                                            }
                                                                                                            else {
                                                                                                                Objects.requireNonNull(companion);
                                                                                                                if (n == 26) {
                                                                                                                    blendMode = BlendMode.SATURATION;
                                                                                                                }
                                                                                                                else {
                                                                                                                    Objects.requireNonNull(companion);
                                                                                                                    if (n == 27) {
                                                                                                                        blendMode = BlendMode.COLOR;
                                                                                                                    }
                                                                                                                    else {
                                                                                                                        Objects.requireNonNull(companion);
                                                                                                                        int n3 = n2;
                                                                                                                        if (n == 28) {
                                                                                                                            n3 = 1;
                                                                                                                        }
                                                                                                                        if (n3 != 0) {
                                                                                                                            blendMode = BlendMode.LUMINOSITY;
                                                                                                                        }
                                                                                                                        else {
                                                                                                                            blendMode = BlendMode.SRC_OVER;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return blendMode;
    }
    
    public static final PorterDuff$Mode b(final int n) {
        final q12$a companion = q12.Companion;
        Objects.requireNonNull(companion);
        final int n2 = 0;
        PorterDuff$Mode porterDuff$Mode;
        if (n == 0) {
            porterDuff$Mode = PorterDuff$Mode.CLEAR;
        }
        else {
            Objects.requireNonNull(companion);
            if (n == 1) {
                porterDuff$Mode = PorterDuff$Mode.SRC;
            }
            else {
                Objects.requireNonNull(companion);
                if (n == 2) {
                    porterDuff$Mode = PorterDuff$Mode.DST;
                }
                else {
                    Objects.requireNonNull(companion);
                    if (n == 3) {
                        porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
                    }
                    else {
                        Objects.requireNonNull(companion);
                        if (n == 4) {
                            porterDuff$Mode = PorterDuff$Mode.DST_OVER;
                        }
                        else {
                            Objects.requireNonNull(companion);
                            if (n == 5) {
                                porterDuff$Mode = PorterDuff$Mode.SRC_IN;
                            }
                            else {
                                Objects.requireNonNull(companion);
                                if (n == 6) {
                                    porterDuff$Mode = PorterDuff$Mode.DST_IN;
                                }
                                else {
                                    Objects.requireNonNull(companion);
                                    if (n == 7) {
                                        porterDuff$Mode = PorterDuff$Mode.SRC_OUT;
                                    }
                                    else {
                                        Objects.requireNonNull(companion);
                                        if (n == 8) {
                                            porterDuff$Mode = PorterDuff$Mode.DST_OUT;
                                        }
                                        else {
                                            Objects.requireNonNull(companion);
                                            if (n == 9) {
                                                porterDuff$Mode = PorterDuff$Mode.SRC_ATOP;
                                            }
                                            else {
                                                Objects.requireNonNull(companion);
                                                if (n == 10) {
                                                    porterDuff$Mode = PorterDuff$Mode.DST_ATOP;
                                                }
                                                else {
                                                    Objects.requireNonNull(companion);
                                                    if (n == 11) {
                                                        porterDuff$Mode = PorterDuff$Mode.XOR;
                                                    }
                                                    else {
                                                        Objects.requireNonNull(companion);
                                                        if (n == 12) {
                                                            porterDuff$Mode = PorterDuff$Mode.ADD;
                                                        }
                                                        else {
                                                            Objects.requireNonNull(companion);
                                                            if (n == 14) {
                                                                porterDuff$Mode = PorterDuff$Mode.SCREEN;
                                                            }
                                                            else {
                                                                Objects.requireNonNull(companion);
                                                                if (n == 15) {
                                                                    porterDuff$Mode = PorterDuff$Mode.OVERLAY;
                                                                }
                                                                else {
                                                                    Objects.requireNonNull(companion);
                                                                    if (n == 16) {
                                                                        porterDuff$Mode = PorterDuff$Mode.DARKEN;
                                                                    }
                                                                    else {
                                                                        Objects.requireNonNull(companion);
                                                                        if (n == 17) {
                                                                            porterDuff$Mode = PorterDuff$Mode.LIGHTEN;
                                                                        }
                                                                        else {
                                                                            Objects.requireNonNull(companion);
                                                                            int n3 = n2;
                                                                            if (n == 13) {
                                                                                n3 = 1;
                                                                            }
                                                                            if (n3 != 0) {
                                                                                porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
                                                                            }
                                                                            else {
                                                                                porterDuff$Mode = PorterDuff$Mode.SRC_OVER;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return porterDuff$Mode;
    }
}

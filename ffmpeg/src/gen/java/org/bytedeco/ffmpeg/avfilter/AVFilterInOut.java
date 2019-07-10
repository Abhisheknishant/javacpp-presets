// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * A linked-list of the inputs/outputs of the filter chain.
 *
 * This is mainly useful for avfilter_graph_parse() / avfilter_graph_parse2(),
 * where it is used to communicate open (unlinked) inputs and outputs from and
 * to the caller.
 * This struct specifies, per each not connected pad contained in the graph, the
 * filter context and the pad index required for establishing a link.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterInOut extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterInOut() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterInOut(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterInOut(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterInOut position(long position) {
        return (AVFilterInOut)super.position(position);
    }

    /** unique name for this input/output in the list */
    public native @Cast("char*") BytePointer name(); public native AVFilterInOut name(BytePointer setter);

    /** filter context associated to this input/output */
    public native AVFilterContext filter_ctx(); public native AVFilterInOut filter_ctx(AVFilterContext setter);

    /** index of the filt_ctx pad to use for linking */
    public native int pad_idx(); public native AVFilterInOut pad_idx(int setter);

    /** next input/input in the list, NULL if this is the last */
    public native AVFilterInOut next(); public native AVFilterInOut next(AVFilterInOut setter);
}

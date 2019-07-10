// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avdevice;

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
import org.bytedeco.ffmpeg.avfilter.*;
import static org.bytedeco.ffmpeg.global.avfilter.*;

import static org.bytedeco.ffmpeg.global.avdevice.*;


/**
 * Structure describes basic parameters of the device.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avdevice.class)
public class AVDeviceInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVDeviceInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVDeviceInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVDeviceInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVDeviceInfo position(long position) {
        return (AVDeviceInfo)super.position(position);
    }

    /** device name, format depends on device */
    public native @Cast("char*") BytePointer device_name(); public native AVDeviceInfo device_name(BytePointer setter);
    /** human friendly name */
    public native @Cast("char*") BytePointer device_description(); public native AVDeviceInfo device_description(BytePointer setter);
}

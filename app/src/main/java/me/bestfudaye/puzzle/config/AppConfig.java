package me.bestfudaye.puzzle.config;

/**
 * Created by Ford on 2016/10/20.
 */
public class AppConfig {

    /**
     * 图片裁剪配置属性
     * */

    //裁剪配置
    public static final boolean TAKE_PIC_CONFIG_IS_CROP = true;//是否裁剪
    public static final boolean TAKE_PIC_CONFIG_CROP_TOOL_IS_CUSTOM = false; //裁剪工具是否自定义
    public static final boolean TAKE_PIC_CONFIG_IS_RATIO_CROP = false; //是否按照比例裁剪图片
    public static final int TAKE_PIC_CONFIG_CROP_WIDTH = 400; //裁剪图片的宽
    public static final int TAKE_PIC_CONFIG_CROP_HEIGHT = 400;//裁剪图片的高

    //压缩图片配置
    public static final boolean TAKE_PIC_CONFIG_IS_COMPRESS = true;//是否压缩
    public static final boolean TAKE_PIC_CONFIG_IS_SHOW_PROGRESS = true;//是否显示压缩进度条
    public static final int TAKE_PIC_CONFIG_PHOTO_MAX_SIZE = 1024*100;//压缩图片不超过 单位为b
    public static final int TAKE_PIC_CONFIG_PHOTO_MAX_WIDTH_OR_HEIGHT = 800;//图片的宽高 不超过800 px

    //选择图片配置
    public static final int TAKE_PIC_CONFIG_SELECT_NUM = 1;//选择图片数量
    public static final boolean TAKE_PIC_CONFIG_SELECT_IS_ALBUM = true;// 是否从相册选择，false 是从文件选择
}

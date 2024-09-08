<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="单位名称" prop="danweimingcheng">
          <el-input v-model="ruleForm.danweimingcheng" readonly              placeholder="单位名称" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="识别码" prop="shibiema">
          <el-input v-model="ruleForm.shibiema"               placeholder="识别码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='zerendanwei'" label="单位封面" prop="danweifengmian">
          <file-upload
          tip="点击上传单位封面"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.danweifengmian?ruleForm.danweifengmian:''"
          @change="zerendanweidanweifengmianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='zerendanwei'"  label="单位性质" prop="danweixingzhi">
          <el-select v-model="ruleForm.danweixingzhi"  placeholder="请选择单位性质">
            <el-option
                v-for="(item,index) in zerendanweidanweixingzhiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="单位电话" prop="danweidianhua">
          <el-input v-model="ruleForm.danweidianhua"               placeholder="单位电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="法人代表" prop="farendaibiao">
          <el-input v-model="ruleForm.farendaibiao"               placeholder="法人代表" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='zerendanwei'"  label="单位地址" prop="danweidizhi">
          <el-input v-model="ruleForm.danweidizhi"               placeholder="单位地址" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='zerendanwei'" label="资质证明" prop="zizhizhengming">
          <file-upload
          tip="点击上传资质证明"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zizhizhengming?ruleForm.zizhizhengming:''"
          @change="zerendanweizizhizhengmingUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="供应商名称" prop="gongyingshangmingcheng">
          <el-input v-model="ruleForm.gongyingshangmingcheng" readonly              placeholder="供应商名称" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="识别码" prop="shibiema">
          <el-input v-model="ruleForm.shibiema"               placeholder="识别码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='gongyingshang'" label="供应商封面" prop="gongyingshangfengmian">
          <file-upload
          tip="点击上传供应商封面"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.gongyingshangfengmian?ruleForm.gongyingshangfengmian:''"
          @change="gongyingshanggongyingshangfengmianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='gongyingshang'"  label="供应商性质" prop="gongyingshangxingzhi">
          <el-select v-model="ruleForm.gongyingshangxingzhi"  placeholder="请选择供应商性质">
            <el-option
                v-for="(item,index) in gongyingshanggongyingshangxingzhiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="供应商电话" prop="gongyingshangdianhua">
          <el-input v-model="ruleForm.gongyingshangdianhua"               placeholder="供应商电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="负责人" prop="fuzeren">
          <el-input v-model="ruleForm.fuzeren"               placeholder="负责人" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='gongyingshang'"  label="供应商地址" prop="gongyingshangdizhi">
          <el-input v-model="ruleForm.gongyingshangdizhi"               placeholder="供应商地址" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='gongyingshang'" label="资质证明" prop="zizhizhengming">
          <file-upload
          tip="点击上传资质证明"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.zizhizhengming?ruleForm.zizhizhengming:''"
          @change="gongyingshangzizhizhengmingUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      zerendanweidanweixingzhiOptions: [],
      gongyingshanggongyingshangxingzhiOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.zerendanweidanweixingzhiOptions = "外资,中外合资,国有企业,私人企业".split(',')
    this.gongyingshanggongyingshangxingzhiOptions = "外资,中外合资,国有企业,私人企业".split(',')
  },
  methods: {
    zerendanweidanweifengmianUploadChange(fileUrls) {
        this.ruleForm.danweifengmian = fileUrls;
    },
    zerendanweizizhizhengmingUploadChange(fileUrls) {
        this.ruleForm.zizhizhengming = fileUrls;
    },
    gongyingshanggongyingshangfengmianUploadChange(fileUrls) {
        this.ruleForm.gongyingshangfengmian = fileUrls;
    },
    gongyingshangzizhizhengmingUploadChange(fileUrls) {
        this.ruleForm.zizhizhengming = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.shibiema)&& 'zerendanwei'==this.flag){
        this.$message.error('识别码不能为空');
        return
      }
        if(this.ruleForm.danweifengmian!=null) {
                this.ruleForm.danweifengmian = this.ruleForm.danweifengmian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'zerendanwei' ==this.flag && this.ruleForm.danweidianhua&&(!isPhone(this.ruleForm.danweidianhua))){
        this.$message.error(`单位电话应输入电话格式`);
        return
      }
      if( 'zerendanwei' ==this.flag && this.ruleForm.lianxifangshi&&(!isMobile(this.ruleForm.lianxifangshi))){
        this.$message.error(`联系方式应输入手机格式`);
        return
      }
        if(this.ruleForm.zizhizhengming!=null) {
                this.ruleForm.zizhizhengming = this.ruleForm.zizhizhengming.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.shibiema)&& 'gongyingshang'==this.flag){
        this.$message.error('识别码不能为空');
        return
      }
        if(this.ruleForm.gongyingshangfengmian!=null) {
                this.ruleForm.gongyingshangfengmian = this.ruleForm.gongyingshangfengmian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'gongyingshang' ==this.flag && this.ruleForm.gongyingshangdianhua&&(!isPhone(this.ruleForm.gongyingshangdianhua))){
        this.$message.error(`供应商电话应输入电话格式`);
        return
      }
      if( 'gongyingshang' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
        if(this.ruleForm.zizhizhengming!=null) {
                this.ruleForm.zizhizhengming = this.ruleForm.zizhizhengming.replace(new RegExp(this.$base.url,"g"),"");
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>

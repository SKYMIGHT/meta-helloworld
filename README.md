Community Resources
===================

Project home:
  * https://github.com/SKYMIGHT/meta-helloworld.git

How to install required packages
================================

$ sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib build-essential chrpath socat libsdl1.2-dev xterm

Install QEMU(optional)

$ sudo apt-get build-dep qemu
$ sudo apt-get remove oss4-dev


How to bitbake
==============

Setup repositories
$ git clone git://git.yoctoproject.org/poky.git
$ cd poky
$ git checkout -b fido origin/fido
$ git clone https://github.com/SKYMIGHT/meta-helloworld.git

Setup build directory
$ source oe-init-build-env 

You can change the target machine by setting MACHINE variable
in local.conf to one of the following machines.
  qemux86, qemux86-64, x86, x64

Apply the your program to rootfs by modify core-image-sato.
The path is in meta/recipes-sato/images/core-image-sato.bb.
Add the line:
    "IMAGE_INSTALL += "helloworld" 


Bitbake kernel and rootfs
$ bitbake core-image-sato

How to run on X86
==================

$ cd poky/build/tmp/deploy/images/genericx86/
$ sudo dd if=core-image-sato-genericx86.hdmimg of=/dev/sdx

Note: /dev/sdx is your USB storage and it format should be ext4

Latest testing commit ID
========================

Yocto Project version: 1.8 'Fido'
Commit ID: 08f9fbbc97909698b56200aa9be5fe50b99a44b2

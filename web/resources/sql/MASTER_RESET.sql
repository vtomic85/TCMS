delete from cms_element;
delete from comment;
delete from comment_rate;
-- Do not delete component_type
delete from contact;
-- Do not delete country
delete from event;
-- Do not delete event_category
delete from gallery;
delete from gallery_images;
delete from image;
delete from index_part;
delete from item where id>2; -- leave nothing but Index and Contact
delete from message;
-- Do not delete message_folder
delete from news;
-- Do not delete news_category
delete from page;
-- Do not delete part
delete from region;
delete from region_part;
-- Do not delete system_parameters, but change the data if needed
delete from toplist;
delete from toplist_element;
delete from toplist_element_relation;
delete from user where id>1; -- leave nothing but admin
delete from user_part;
delete from user_part_config;
delete from user_registration;
-- Do not delete user_type
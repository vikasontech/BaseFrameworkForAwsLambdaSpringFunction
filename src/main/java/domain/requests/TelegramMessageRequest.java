package domain.requests;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import domain.requests.TelegramMessageRequest.Chat.From.Message;

import java.util.HashMap;
import java.util.Map;

/**
 * {
 * "update_id": 726157558,
 * "message": {
 * "message_id": 105,
 * "from": {
 * "id": 1577527776,
 * "is_bot": false,
 * "first_name": "Vikas",
 * "last_name": "Verma",
 * "username": "vikas_on",
 * "language_code": "en"
 * },
 * "chat": {
 * "id": 1577527776,
 * "first_name": "Vikas",
 * "last_name": "Verma",
 * "username": "vikas_on",
 * "type": "private"
 * },
 * "date": 1662194164,
 * "text": "how are you"
 * }
 * }
 */
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TelegramMessageRequest {
  private Integer updateId;
  private Message message;
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  public Integer getUpdateId() {
    return updateId;
  }

  public void setUpdateId(Integer updateId) {
    this.updateId = updateId;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
  static class Chat {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getFirstName() {
      return firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getLastName() {
      return lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public String getUsername() {
      return username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }

    public Map<String, Object> getAdditionalProperties() {
      return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
      this.additionalProperties.put(name, value);
    }


    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    static class From {

      private Integer id;
      private Boolean isBot;
      private String firstName;
      private String lastName;
      private String username;
      private String languageCode;
      private Map<String, Object> additionalProperties = new HashMap<String, Object>();

      public Integer getId() {
        return id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public Boolean getIsBot() {
        return isBot;
      }

      public void setIsBot(Boolean isBot) {
        this.isBot = isBot;
      }

      public String getFirstName() {
        return firstName;
      }

      public void setFirstName(String firstName) {
        this.firstName = firstName;
      }

      public String getLastName() {
        return lastName;
      }

      public void setLastName(String lastName) {
        this.lastName = lastName;
      }

      public String getUsername() {
        return username;
      }

      public void setUsername(String username) {
        this.username = username;
      }

      public String getLanguageCode() {
        return languageCode;
      }

      public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
      }

      public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
      }

      public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
      }


      @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
      static class Message {

        private Integer messageId;
        private From from;
        private Chat chat;
        private Integer date;
        private String text;
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        public Integer getMessageId() {
          return messageId;
        }

        public void setMessageId(Integer messageId) {
          this.messageId = messageId;
        }

        public From getFrom() {
          return from;
        }

        public void setFrom(From from) {
          this.from = from;
        }

        public Chat getChat() {
          return chat;
        }

        public void setChat(Chat chat) {
          this.chat = chat;
        }

        public Integer getDate() {
          return date;
        }

        public void setDate(Integer date) {
          this.date = date;
        }

        public String getText() {
          return text;
        }

        public void setText(String text) {
          this.text = text;
        }

        public Map<String, Object> getAdditionalProperties() {
          return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
          this.additionalProperties.put(name, value);
        }

      }
    }
  }

  @Override
  public String toString() {
    return "TelegramMessageRequest{" +
        "updateId=" + updateId +
        ", message=" + message +
        ", additionalProperties=" + additionalProperties +
        '}';
  }
}
